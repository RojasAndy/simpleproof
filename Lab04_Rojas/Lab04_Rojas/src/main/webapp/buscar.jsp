<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Buscar</title>
</head>
<body>
<h3>Buscar Producto</h3>
<form action="ProcesoServlet" method=post>
<input type="text" name="nombreb" placeholder="Ingrese el nombre del producto"><br><br>
<input type="submit" value="Buscar">
<input type="reset" value="Limpiar">
</form>
<br><br>
<%@ include file="pie.jsp" %>
</body>
</html>