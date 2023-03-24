package ejercicio01;

import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		int  miEntero;
	    char miCaracter;

	    try
	    {
	       FileReader miArchivo = new FileReader("pepe.txt");

	       miEntero = miArchivo.read();
	       while ( miEntero != -1 ) 
	       {
	         miCaracter = (char) miEntero; 
	         System.out.print(miCaracter); 
	         miEntero = miArchivo.read();
	       }
	       miArchivo.close();

	    } catch ( IOException ex ) {
    		System.out.println("Exception");
	    }
	    
	}

}