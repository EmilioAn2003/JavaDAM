package resueltas;

public class Resuelta08 {

	public static void main(String[] args) {
		
		String prefijo="Javalin, javalon";
		String sufijo="javalen, len, len";
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Frase: ");
		String frase = sc.nextLine();
		String traduccion=frase;
		
		if(frase.startsWith(prefijo)) 	traduccion=traduccion.substring(prefijo.length());
		if(frase.endsWith(sufijo)) 		traduccion=traduccion.substring(0, traduccion.length()-sufijo.length());
		
		traduccion = traduccion.strip();
		
		if(!frase.equals(traduccion)) System.out.println("Traduccion: " + traduccion);
	
	}	
}
