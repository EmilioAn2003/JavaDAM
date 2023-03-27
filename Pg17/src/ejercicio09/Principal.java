package ejercicio09;

import java.sql.*;
import java.util.ArrayList;

public class Principal {
	
	private static String url = "jdbc:mysql://localhost:3306/BContactos";
	private static String usuario = "root";
	private static String password = "";
	
	public static void main(String[] args) {
		
		for(Contacto c:contactosMurciaFijos()) System.out.println(c.toString());
	
	}
	
	public static ArrayList<Contacto> contactosMurciaFijos(){
		
		String etiqueta= "Fijo";
		String prefijoMurcia1= "968";
		String prefijoMurcia2= "868";
		
		ArrayList<Contacto> contactos=new ArrayList<Contacto>();
		
		try {  
			
			Connection con= DriverManager.getConnection(url,usuario,password);
		
			String consulta="SELECT C.IdContacto, C.Nombre, C.Apellido "
					+ "FROM TContactos AS C, TEtiquetas AS E, TTelefonos AS T "
					+ "WHERE C.IdContacto=T.IdContacto AND T.IdEtiqueta=E.IdEtiqueta AND "
					+ "E.Etiqueta='"+etiqueta+"' AND (T.Telefono LIKE '"+prefijoMurcia1+"%' OR T.Telefono LIKE '"+prefijoMurcia2+"%')";
			
			Statement st= con.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			
			while(rs.next()) contactos.add(new Contacto( rs.getInt(1), rs.getString(2), rs.getString(3)));
			
			for(Contacto c:contactos) {
				
				consulta="SELECT Telefono FROM TTelefonos WHERE IdContacto="+c.getId();
				rs = st.executeQuery(consulta);
				
				while(rs.next()) c.addNumero(rs.getString(1));
			}
			
			return contactos;
		}catch(Exception e) { 
			
			System.out.println("Error de connecion a la base de datos"); 
			return null;
			
		}
	} 
	
}
