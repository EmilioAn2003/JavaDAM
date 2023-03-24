package ejercicio02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		FileWriter fDestino = new FileWriter("mitexto.txt");
		 
	    String miFrase = "Archivo mitexto.txt";
	    for ( int i=0; i< miFrase.length(); i++) fDestino.write((int)miFrase.charAt(i));

	    fDestino.close();

	    // ...

	    int miEntero = 0;
	    FileReader fOrigen = new FileReader("mitexto.txt");

	    miEntero = fOrigen.read();
	    while  ( miEntero != -1 )
	    {
	       System.out.print((char)miEntero);
	       miEntero = fOrigen.read();  
	    }

	    fOrigen.close();


	}

}
