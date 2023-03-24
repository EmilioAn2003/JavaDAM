package ejercicio04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		BufferedReader fOrigen;
		BufferedWriter fDestino;
		
		// ...

	    fOrigen  = new BufferedReader( new FileReader("lineas.txt") );
	    fDestino = new BufferedWriter( new FileWriter("renglones.txt") );

	    String miString = fOrigen.readLine();
	    while ( miString != null )
	    {
	        fDestino.write(miString,0,miString.length());
	        fDestino.newLine(); 
	        miString = fOrigen.readLine();
	    }
		
	    fDestino.close();
	    fOrigen.close();

	    // ...
	    

	    fOrigen  = new BufferedReader( new FileReader("renglones.txt") );

	    miString = fOrigen.readLine();
	    while ( miString != null )
	    {
		System.out.println(miString);
	        miString = fOrigen.readLine();
	    }
	    
	    fOrigen.close();

	}

}
