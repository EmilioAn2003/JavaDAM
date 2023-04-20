package aplicacion;

import java.util.Arrays;
import java.util.Collections;

public class Aplicacion14 {

	public static void main(String[] args) {
		
		String[] contactos= {};
		String elige;
		
		do {
			elige = pedirString("Elige: ");
			
			switch(elige) {
				case "1" -> contactos = añadirContacto(contactos);
				case "2" -> System.out.println(telefonoDe(contactos));
				case "3" -> mostrarContactos(contactos);
				case "4" -> System.out.println("Saliendo");
				
				default -> System.out.println("Opcion no existente");
			}
		}while(!elige.equals("4"));
	}
	
	public static String pedirString(String pregunta) {
		
		System.out.print(pregunta);
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		return sc.nextLine();
		
	}
	
	public static String[] añadirContacto(String[] contactos) {
		
		String contacto = pedirString("Nombre: ");
		contacto += ":"+ pedirString("Telefono: ");
		
		contactos = Arrays.copyOf(contactos, contactos.length+1);
		contactos[contactos.length-1] = contacto;
		
		return contactos;
	}
	
	public static String telefonoDe(String[] contactos) {
		
		String nombre = pedirString("Nombre: ");
		
		for(String c:contactos) if(c.startsWith(nombre)) return c.substring(c.indexOf(":")+1,c.length());
		
		return "Contacto no encontrado";
	}
	
	public static void mostrarContactos(String[] contactos) {
		
		Arrays.sort(contactos);
		
		if( !(contactos == null) ) for(String c:contactos) System.out.println(c);
	}
}
