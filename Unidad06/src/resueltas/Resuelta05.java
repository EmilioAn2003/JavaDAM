package resueltas;

public class Resuelta05 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Frase: ");
		
		String invertir="", frase=sc.nextLine();
		
		for(int i=frase.length()-1; i>=0; i--) {
		
			invertir+=frase.charAt(i);
			
		}
		
		System.out.println(invertir);
	}

}
