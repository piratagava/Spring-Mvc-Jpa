package com.hernan.app.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.hernan.app.model.Persona;
import com.hernan.app.service.PersonaService;

//se define para decir que la clase va ser el controlador un ejemplo un controlador web
//sirve cuando se van utiliazar RequestMapping
@Controller
public class Controlador {

	//sirve para indicar spring que debe realizar una inyeccion lugar de que cada clase tenga
	//que instanciar los objetos que necesite sea spring que los inyecte esos objetos.
	@Autowired
	private PersonaService personaService;

	//declaracion de manera global mav
	ModelAndView mav = new ModelAndView();

	// Aquí solo se reubica en el index principal
	@RequestMapping("/")
	//ModelAndView regresa tanto como modelo y vista de nuestro controlador
	public ModelAndView listEmployee(ModelAndView model){
		//obtenemos los datos de todos lo registros de la bd en nuestra tabla persona
		List<Persona> personaLista = personaService.getAllPersonas();
		//agrega un atributo al modelo
		model.addObject("personaLista", personaLista);
		//agrega la ruta para ModelAndView
		model.setViewName("index");
		return model;
	}

	// aqui obtiene y prepara la pagina inicial para agregar nuevo registro
	@RequestMapping(value = "/AgregarPersona", method = RequestMethod.GET)
	public ModelAndView AgregarPersona() {
		//prepara para generar nuevo registro de persona
		mav.addObject(new Persona());
		mav.setViewName("agregarPersona");
		return mav;
	}

	// sirve para agregar un nuevo registro persona
	@RequestMapping(value = "/AgregarPersona", method = RequestMethod.POST)
	public ModelAndView guardarPersona(@ModelAttribute Persona persona) {
		//@ModelAttribute indica que se van a trabajar con los atributos del modelo
		personaService.crearPersona(persona);
		return new ModelAndView("redirect:/");
	}

	// sirve para redireccionar la pagina inicial
	@RequestMapping(value = "/cancelar", method = RequestMethod.GET)
	public String Regresar() {
		return "redirect:/";
	}

	// Son para editar los datos de la persona obtiene nuevamente la lista con boton
	// update
	@RequestMapping(value = "/actualizarPersona", method = RequestMethod.GET)
	public ModelAndView EditarPersona() {
		List<Persona> personaLista = personaService.getAllPersonas();
		mav.addObject("personaLista", personaLista);
		mav.setViewName("actualizarPersona");
		return mav;
	}

	// Son para editar los datos de la persona
	@RequestMapping(value = "/editPersona", method = RequestMethod.GET)
	public String showFormForUpdate(@RequestParam("id_persona") int id_persona, Model model) {
		Persona Person = personaService.getPersona(id_persona);
		model.addAttribute("Person", Person);
		return "editPersona";
	}

	// sirve para actualizar los datos de de mi formulario
	@RequestMapping(value = "/editPersona", method = RequestMethod.POST)
	public ModelAndView editarPersona(@ModelAttribute Persona persona) {
		personaService.actualizarPersona(persona);
		return new ModelAndView("redirect:/");
	}

	// Esto es para Eliminar los datos muestro nueva vista para eliminar en la tabla
	@RequestMapping(value = "/eliminarPersona", method = RequestMethod.GET)
	public ModelAndView EliminarPersona() {
		List<Persona> personaLista = personaService.getAllPersonas();
		mav.addObject("personaLista", personaLista);
		mav.setViewName("eliminarPersona");
		return mav;
	}

	@RequestMapping("/borrar")
	public String deleteCustomer(@RequestParam("id_persona") int id_persona) {
		personaService.eliminarPersona(id_persona);
		return "redirect:/";
	}
}
