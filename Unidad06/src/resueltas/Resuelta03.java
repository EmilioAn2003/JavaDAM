package resueltas;

public class Resuelta03 {
	
	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Guarda tu contraseña: ");
		
		String input, contrasenya=sc.nextLine();
		int comparacion;
		
		do {
			
			System.out.print("Contraseña: ");
			input=sc.nextLine();
			
			for(int i=0; i<contrasenya.length(); i++) {
				
				char b='?', a= contrasenya.charAt(i);
				if(i<input.length()) b= input.charAt(i);
				System.out.print( a==b? a : "?");
				
			}
			
			System.out.println();
			
			comparacion=contrasenya.compareTo(input);
			
			if(comparacion<0) System.out.println("La contraseña es menor");
			if(comparacion>0) System.out.println("La contraseña es mayor");
			
		}while(comparacion!=0);
		
		System.out.println("Acceso concedido");
	}
}
