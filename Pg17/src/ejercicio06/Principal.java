package ejercicio06;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Principal {

	private static String url = "jdbc:mysql://localhost:3306/BClientes";
    private static String usuario = "root";
    private static String password = "root";
	
	
 public static void main(String[] args) {
	 
   try 
    {
	   /*
	 Connection con = DriverManager.getConnection(url,usuario,password);
     Statement st = con.createStatement();
     st.executeUpdate("INSERT INTO TClientes VALUES (10,'pwantonio','antonio alcaraz')");
     st.executeUpdate("INSERT INTO TClientes VALUES (20,'pwjuan','juan gomez')");
     
     ResultSet rs = st.executeQuery("SELECT * FROM TClientes");
     while(rs.next())
     {
           int idCliente = rs.getInt("IdCliente");
           String password = rs.getString("Password");
           String nombre = rs.getString("Nombre");
           System.out.println(idCliente+" "+ password + " "+nombre); 
     } 
     */
     
  } catch (Exception ex) {ex.printStackTrace();}
		
	}
}
