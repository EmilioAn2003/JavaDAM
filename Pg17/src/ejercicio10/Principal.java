package ejercicio10;

import java.util.Scanner;
import java.sql.*;
import java.util.Date;

public class Principal {

	private static String url = "jdbc:mysql://localhost:3306/BDiccionario";
	private static String usuario = "root";
	private static String password = "";
	private static String direccionFichero="src/ejercicio10/";
			
	public static void main(String[] args) {
		
		try {  
			
			Connection con= DriverManager.getConnection(url,usuario,password);
			
			FechaHora ahora=new FechaHora(new Date());
			String nombreFichero="Informe "+ahora.toString()+".txt"; 
			
			direccionFichero+=nombreFichero;
			Fichero f= new Fichero(direccionFichero);
			
			Scanner sc = new Scanner(System.in);
			int jugadas = 0, errores = 0, consecutivas = 0;
			
			do {
				Palabra p = palabraAleatoria(con);
				
				String pregunta="Traduzca: " + p.getEspanyol();
				System.out.println(pregunta);
				
				String respuesta=sc.nextLine().toUpperCase();
				jugadas++;
				
				if (respuesta.equals(p.getIngles())) { consecutivas++; }
				else { errores++; consecutivas = 0; }
				
				respuesta="Respuesta: "+respuesta;
				String jugada = jugadas+" | "+pregunta+" | "+respuesta+" | "+p.toString();
				f.addLine(jugada);
				
			} while (!(jugadas == 10 || errores == 3 || consecutivas == 4));

			if (consecutivas == 4) System.out.println("Has ganado");
			else System.out.println("Has perdido");

			sc.close();
		
		}catch(Exception e) { 
			System.out.println("Error de connecion a la base de datos"); 
		}
	}
	
	public static Palabra palabraAleatoria(Connection con) {
		try {
			String consulta="SELECT * FROM TPalabras ORDER BY rand() LIMIT 1";
			
			Statement st= con.createStatement();
			ResultSet rs = st.executeQuery(consulta);
			
			if(rs.next()) return new Palabra( rs.getInt(1), rs.getString(2), rs.getString(3));
			
			return null;
		} catch(Exception e) { return null; }
	}

}