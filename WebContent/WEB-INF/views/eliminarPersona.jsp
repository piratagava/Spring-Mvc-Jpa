<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Esto es Boostrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" type="text/css" href="WEB-INF/css/estilos.css" />
<title>index</title>
</head>
<body>
	<div class="container mt-4">
		<div class="card border-info">
			<div class="card-header bg-info text-plight">
			<div align="center">
				<a class="btn btn-primary" href="cancelar">Cancelar Operacion</a>
			</div>
			</div>
			<div class="card-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>Nombre</th>
							<th>Apellido Paterno</th>
							<th>Apellido Materno</th>
							<th>Eliminar Registro</th>
						</tr>
					</thead>
					<tbody>
					<!-- Recorremos la lista con forEach para ver todos nuestros registros -->
						<c:forEach var="dato" items="${personaLista}">
						<!-- creo una variable La etiqueta formatea una URL en una cadena y la almacena en una variable -->
							<c:url var="delete" value="borrar">
								<c:param name="id_persona" value="${dato.id_persona}" />
							</c:url>
							<tr>
								<td>${dato.id_persona}</td>
								<td>${dato.nombre}</td>
								<td>${dato.apellidoPaterno}</td>
								<td>${dato.apellidoMaterno}</td>
								<td>
								<!-- Solicito confirmacion de borrado para mi registro en caso de no querer borrar -->
								<a class="btn btn-danger" href="${delete}"
									onclick="if (!(confirm('Esta seguro de Eliminar el Registro de la Persona ?'))) return false" >Borrar</a>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>