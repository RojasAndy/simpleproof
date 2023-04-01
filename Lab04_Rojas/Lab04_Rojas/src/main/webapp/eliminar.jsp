<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="datos.ControladorSql" %>
    <%@ page import="java.sql.*" %>
    <%@ page import="javax.swing.*" %>
    <%@ page import="java.util.Scanner" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Eliminar</title>
</head>
<body>
<h3>Eliminar Productos</h3>
<form action="ProcesoServlet" method=post>
<input type="text" name="codigoe" placeholder="Ingrese el c'odigo del producto"><br><br>
<input type="submit" value="Eliminar">
</form>

<br><br>
<%@ include file="pie.jsp" %>
</body>
</html>