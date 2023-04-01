package datos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class ProcesoServlet2
 */
@WebServlet("/ProcesoServlet2")
public class ProcesoServlet2 extends HttpServlet {
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
		  ControladorSql df = new ControladorSql();
		  ResultSet txc = df.consu("select * from producto");
		  while(txc.next()){
			  shoot.println( txc.getInt(1));
			  shoot.println( txc.getString(2));
			  shoot.println( txc.getDouble(3));
			  shoot.println( txc.getInt(4));
		  }
		  
	  }catch(NumberFormatException r){
		  shoot.println("Error num'erico");
	  }catch(SQLException mn) {
		  shoot.println("Error SQL");
	  }catch(IllegalStateException fghb) {
		  shoot.println("Error musk");
	  }
	}
}