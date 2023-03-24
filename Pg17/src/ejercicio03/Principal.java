package ejercicio03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		String miString;
	    BufferedReader fOrigen  = new BufferedReader( new FileReader("lineas.txt") );

	    miString = fOrigen.readLine();
	    while ( miString != null )
	    {
		System.out.println(miString);
	        miString = fOrigen.readLine();
	    }
	    fOrigen.close();

	}

}
