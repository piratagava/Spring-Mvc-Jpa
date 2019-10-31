<%-- 
    Document   : agregar
    Created on : 26/07/2019, 02:03:13 PM
    Author     : hernan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
				<h4>Agregar Persona</h4>
			</div>
			<div class="card-body">
			
				<form method="POST">
				
					<label>Nombre</label> 
					<input type="text" name="nombre" class="form-control" required="true"> 
					<label>Apellido Paterno</label>
					<input type="text" name="ApellidoPaterno" class="form-control" required="true">
				    <label>Apellido Materno</label>
				    <input type="text" name="ApellidoMaterno" class="form-control" required="true">
					 <br>
					 <div align="center"><input type="submit" value="Agregar Registro" class="btn btn-success"></div>					 
				</form>
				<br>
				 <div align="center"><a class="btn btn-primary" href="cancelar">Cancelar Registro</a></div>
			</div>
		</div>
	</div>
</body>
</html>