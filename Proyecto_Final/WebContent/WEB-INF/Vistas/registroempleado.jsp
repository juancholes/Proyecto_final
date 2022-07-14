<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formulario registro</title>
</head>
<body>
	<div class="container">
		<h1 class="text-center">Registro Empleado Formulario</h1>
			<form action="<%= request.getContextPath() %>/EmpleadoServlet" method="post">
				<table style="with: 80%">
					<tr>
						<td>Nombre</td>
						<td><input type="text" name="nombre" /></td>
					</tr>
					<tr>
						<td>Apellido</td>
						<td><input type="text" name="apellido" /></td>
					</tr>
					<tr>
						<td>Usuario</td>
						<td><input type="text" name="usuario" /></td>
					</tr>
					<tr>
						<td>Contraseña</td>
						<td><input type="password" name="contraseña" /></td>
					</tr>
					<tr>
						<td>Direccion</td>
						<td><input type="text" name="direccion" /></td>
					</tr>
					<tr>
						<td>Contacto</td>
						<td><input type="text" name="contacto" /></td>
					</tr>
				</table>
			<input type="submit" value="Submit" />
		 </form>
	</div>
</body>
</html>