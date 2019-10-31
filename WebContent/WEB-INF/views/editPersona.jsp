<%-- 
    Document   : editarCategoria
    Created on : 26/07/2019, 04:15:43 PM
    Author     : anonymous
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>JSP Page</title>
</head>
<body>
	<div class="container mt-4 col-lg-4">
		<div class="card border-info">
			<div class="card-header bg-info">
				<h4 align="center">Actualizar</h4>
			</div>
			<div class="card-body">

				<form method="post">
				
					<form:hidden path="Person.id_persona" name="id_persona" />

					<label>Nombre</label>
					<form:input path="Person.nombre" type="text" name="nombre"
						class="form-control" required="true"/>

					<label>Apellido _Paterno</label>
					<form:input path="Person.apellidoPaterno" type="text"
						name="Apellido Paterno" class="form-control" required="true"/>

					<label>Apellido_Materno</label>
					<form:input path="Person.apellidoMaterno" type="text"
						name="Apellido Materno" class="form-control" required="true"/>
						
					<br>
					<div align="center">
						<input type="submit" value="Actualizar datos"
							class="btn btn-success">
					</div>

					<br>
					<div align="center">
						<a class="btn btn-primary" href="cancelar">Cancelar Operacion</a>
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>