<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Editar</title>
</head>
<body>
<h3>Editar Producto</h3>
<form action="ProcesoServlet" method=post>
<input type="text" name="codigod" placeholder="Ingrese el código del producto original"><br><br>
<input type="text" name="nombred" placeholder="Ingrese el nombre que desee"><br><br>
<input type="text" name="preciod" placeholder="Ingrese el precio que desee"><br><br>
<input type="text" name="stockd" placeholder="Ingrese el stock que desee"><br><br><br>
<input type="submit" value="Editar">
<input type="reset" value="Limpiar">
</form>
<br><br>
<%@ include file="pie.jsp" %>
</body>
</html>