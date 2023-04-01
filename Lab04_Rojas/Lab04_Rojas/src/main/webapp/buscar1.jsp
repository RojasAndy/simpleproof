<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page import="datos.ControladorSql" %>
    <%@ page import="java.sql.*" %>
    <%@ page import="javax.swing.*" %>
    <%@ page import="datos.ProcesoServlet" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Buscar1</title>
</head>
<body>

<h3>Buscando producto</h3>
<table id="produ">
   <tr>
      <th>C'odigo</th>
      <th>Nombre</th>
    
      <th>Precio</th>
      <th>Stock</th>
      
 
<% 
String klm = (String)session.getAttribute("t"); 
int klm2 = (int)session.getAttribute("t2"); 
Double klm3 = (Double)session.getAttribute("t3"); 
int klm4 = (int)session.getAttribute("t4"); 

%>  
    <tr>
	    <td><%=klm2%></td>
	    <td><%=klm%></td>
	    <td><%=klm3%></td>
	    <td><%=klm4%></td>
    </tr>
   
</tr>
</table>  
<br><br>
<a href="busqueda.jsp">Buscar otro producto</a> 
<br><br>
<%@ include file="pie.jsp" %>
</body>
</html>