package ejercicio10;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Principal {

	private static String url = "jdbc:mysql://localhost:3306/BDiccionario";
	private static String usuario = "root";
	private static String password = "";
	private static String direccionFicheros="src/ejercicio10/";

	public static void main(String[] args) {
		
		try {  
			
			Connection con= DriverManager.getConnection(url,usuario,password);
			
			//Insertar palabras del fichero Palabras.txt en la base de datos
			
			String nombreFicheroPalabras="Palabras.txt";
			
			FicheroBDiccionario ficheroBD= new FicheroBDiccionario(direccionFicheros,nombreFicheroPalabras, con);
			
			ficheroBD.ejecutar();
			
			//Crear Fichero Informe
			
			FechaHora ahora=new FechaHora(new Date());
			String nombreFicheroInforme="Informe "+ahora.toString()+".txt"; 
			
			Fichero Informe= new Fichero(direccionFicheros, nombreFicheroInforme);
			
			//empieza el juego
			
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
				
				Informe.writeLine(jugada);
				
			} while (!(jugadas == 10 || errores == 3 || consecutivas == 4));

			if (consecutivas == 4) {
				Informe.writeLine("Juego ganado :)");
				System.out.println("Has ganado");
			}else {
				Informe.writeLine("Juego perdido :(");
				System.out.println("Has perdido");
			}

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