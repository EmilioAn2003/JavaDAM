package resueltas;

public class Resuelta04 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Frase: ");
		
		String frase=sc.nextLine();
		
		int contador=0;
		
		for(int i=0; i<frase.length(); i++) {
			
			if(Character.isSpaceChar(frase.charAt(i))) contador++;
			
		}
	
		System.out.println("Espacios blancos: " +contador);
	
	}

}
