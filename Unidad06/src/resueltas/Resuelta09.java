package resueltas;

public class Resuelta09 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		String frase="", palabra;
		boolean añadir;
		
		do {
		
			System.out.print("Palabra: ");
			palabra = sc.nextLine();
			
			añadir=!palabra.toLowerCase().equals("fin");
			
			if(añadir) frase+=frase.isEmpty()? palabra : " "+palabra;
			
		}while(añadir);
		
		System.out.println(frase);
	}

}
