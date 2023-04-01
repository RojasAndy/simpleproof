<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Insertar</title>
</head>
<body>
<h3>Registrar productos</h3>
<form action="ProcesoServlet" method=post>
<input type="text" name="codigo" placeholder="Ingrese el c'odigo del producto"><br><br>
<input type="text" name="nombre" placeholder="Ingrese el nombre del producto"><br><br>
<input type="text" name="precio" placeholder="Ingrese el precio del producto"><br><br><br>
<input type="text" name="stock" placeholder="Ingrese el stock del producto"><br><br><br>
<input type="submit" value="Registrar">
<input type="reset" value="Limpiar">
</form>
<br><br>
<%@ include file="pie.jsp"%>
</body>
</html>