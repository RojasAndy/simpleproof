package datos;

import datos.ControladorSql;
import java.util.List;
import java.sql.*;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter; 

@WebServlet("/ProcesoServlet")
public class ProcesoServlet extends HttpServlet{
	PrintWriter shoot;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		processRequest(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		processRequest(request,response);
	}
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		 try {
			  shoot = response.getWriter();
			  String nprd = request.getParameter("nombreb");
			  
			  
			  ControladorSql j = new ControladorSql();
			  ResultSet u = j.consu("select * from producto where nombre='"+nprd+"' ");
			  
			  while(u.next()) {
				 int abc =  u.getInt(1);
				 String abd = u.getString(2);
				 Double abe = u.getDouble(3);
				 int abf = u.getInt(4);
				 request.getSession().setAttribute("t", abd);
				 request.getSession().setAttribute("t2", abc);
				 request.getSession().setAttribute("t3", abe);
				 request.getSession().setAttribute("t4", abf);
				 response.sendRedirect("buscar1.jsp");
			  }
			  
			  
			  
		 }catch(NullPointerException | SQLException e){
			  shoot.println("No se pudo conectar");
		 }
		 
		 
	  try{
		  int edt = Integer.parseInt(request.getParameter("codigod"));
		  String nomdt = request.getParameter("nombred");
		  double ghj = Double.parseDouble(request.getParameter("preciod"));
		  int tyu = Integer.parseInt(request.getParameter("stockd"));
		  ControladorSql klj = new ControladorSql();
		  boolean oi = klj.edition(edt,nomdt,ghj,tyu);
		  if (oi==true){
			 shoot.println("Producto editado correctamente");
	      }else{ 
			  shoot.println("Error al editar");
			   } 
		  }catch(NumberFormatException e8){
			  JOptionPane.showMessageDialog(null,"Error num'erico" +e8);
		  }
	  
	  try{
			int asd = Integer.parseInt(request.getParameter("codigoe"));
			if (asd > 0){
				ControladorSql iio = new ControladorSql();
				boolean vc = iio.elimi(asd);
				response.sendRedirect("ProcesoServlet2");
			}
		}catch(NumberFormatException e9){
			JOptionPane.showMessageDialog(null, "Error en el n'umero" +e9);
		}
	  
	  try{
		    
			int cwq = Integer.parseInt(request.getParameter("codigo"));
			String nwq = request.getParameter("nombre");
			double pwq = Double.parseDouble(request.getParameter("precio"));
			int swq = Integer.parseInt(request.getParameter("stock"));
			ControladorSql z = new ControladorSql();
			boolean yr = z.insertar(cwq,nwq,pwq,swq);
			if(yr==true){
				shoot.println("Producto registrado correctamente");
			}else{ 
				shoot.println("Error al registrar");
			}
		}catch(NumberFormatException e5){
		    JOptionPane.showMessageDialog(null, "Error en el formato del n'umero" +e5);
		} 
	  

	}
}
