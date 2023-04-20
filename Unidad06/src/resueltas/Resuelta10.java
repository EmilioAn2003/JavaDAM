package resueltas;

public class Resuelta10 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Frase: ");
		
		String invertir="", sinEspacios="",frase=sc.nextLine();
		
		for(int i=0; i<frase.length(); i++) {
		
			char  c= Character.toLowerCase(frase.charAt(i));
			
			if(!Character.isSpaceChar(c)) {
				
				invertir = c + invertir; 
				sinEspacios = sinEspacios + c;
			
			}
		}
		
		if(invertir.equals(sinEspacios)) System.out.println("Es palindroma");
		else System.out.println("No es palindroma");
		
	}

}
