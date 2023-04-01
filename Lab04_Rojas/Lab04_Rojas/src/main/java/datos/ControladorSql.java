package datos;
import java.sql.*;
import javax.swing.*;

public class ControladorSql {
	public Connection conx;
	public Statement stm;
	public PreparedStatement stm2;
	public ResultSet rs;
	public String driver="com.mysql.cj.jdbc.Driver";
	public String db="jdbc:mysql://localhost/inventario";
	public String user="root";
	public String contr="";
	
	public Connection conexx() {
		try {
			Class.forName(driver);
			conx=DriverManager.getConnection(db,user,contr);
		}catch(ClassNotFoundException e1) {
			JOptionPane.showMessageDialog(null,"Error en el driver"+ e1);
		}catch(SQLException e2) {
			JOptionPane.showMessageDialog(null,"Error en la conexi'on"+ e2);
		}
		return conx;
	}
	
	public ResultSet consu(String codesql) {
		try {
			stm=conexx().createStatement();
			rs=stm.executeQuery(codesql);
		}catch(SQLException e3) {
			JOptionPane.showMessageDialog(null, "Error en la consulta" + e3);
		}
		return rs;
	}
	
	public boolean insertar(int codins, String nomins, double preins, int stoins) {
		try {
			String sqlcode="insert into producto values(?,?,?,?)";
			stm2=conexx().prepareStatement(sqlcode);
			stm2.setInt(1, codins);
			stm2.setString(2, nomins);
			stm2.setDouble(3, preins);
			stm2.setInt(4,stoins);
			stm2.executeUpdate();	
		}catch(SQLException e3) {
			JOptionPane.showMessageDialog(null, "Error en el proceso de registro");		
		}
		return true;
	}
	
	public boolean edition(int ced, String ned, double ped, int sed) {
		try {
			String sqlcode2="update producto set nombre=? , precio=?, stock=? where codigo=?";
		    stm2=conexx().prepareStatement(sqlcode2);
		    stm2.setString(1, ned);
		    stm2.setDouble(2, ped);
		    stm2.setInt(3, sed);
		    stm2.setInt(4,ced);
		    stm2.executeUpdate();
		}catch(SQLException e5) {
			JOptionPane.showMessageDialog(null, "Error en SQL");
		}catch(NumberFormatException e5) {
			JOptionPane.showMessageDialog(null, "Error en el formato de n'umero");
		}
		return true;
	}
	
	public boolean  elimi(int codelim) {
		try {
			String sqlelcod="delete from producto where codigo=?";
			stm2=conexx().prepareStatement(sqlelcod);
			stm2.setInt(1, codelim);
			stm2.executeUpdate();
		}catch(NumberFormatException e7) {
			JOptionPane.showMessageDialog(null, "Error en el formato de n'umero");
		}catch(SQLException e9) {
			JOptionPane.showMessageDialog(null, "Error SQL");
		}
		return true;
	}
}
