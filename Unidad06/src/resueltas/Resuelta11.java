package resueltas;

public class Resuelta11 {

	public static void main(String[] args) {
		
		char[] c1= {'e','i','k','m','p','q','r','s','t','u','v'};
		char[] c2= {'p','v','i','u','m','t','e','r','k','q','s'};
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Frase: ");
		char[] frase=sc.nextLine().toCharArray();
		
		for(int i=0; i<frase.length; i++) {
			frase[i]= codifica(c1, c2, frase[i]);
		}
		
		System.out.println(String.valueOf(frase));
	}
	
	public static char codifica(char[] c1, char[] c2, char c) {
		
		for(int i=0; i<c1.length; i++) if(c1[i]==Character.toLowerCase(c)) return c2[i];
		
		return c;
	}

}
