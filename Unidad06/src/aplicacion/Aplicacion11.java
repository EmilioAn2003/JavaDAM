package aplicacion;

public class Aplicacion11 {

public static void main(String[] args) {
		
		char[] c1= {'e','i','k','m','p','q','r','s','t','u','v'};
		char[] c2= {'p','v','i','u','m','t','e','r','k','q','s'};
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Frase: ");
		
		String frase= codifica( c1, c2, sc.nextLine());
		
		System.out.println(frase);
		
		frase = descodifica(c1, c2, frase);
		
		System.out.println(frase);
	}

	public static String codifica(char[] c1, char[] c2, String f) {
		
		String codificada="";
		
		for(int i=0; i<f.length(); i++) codificada += codifica(c1, c2, f.charAt(i));
		
		return codificada;
	}
	
	public static char codifica(char[] c1, char[] c2, char c) {
		
		for(int i=0; i<c1.length; i++) if(c1[i]==Character.toLowerCase(c)) return c2[i];
		
		return c;
	}
	
	public static String descodifica(char[] c1, char[] c2, String f) {
		
		String descodificada="";
		
		for(int i=0; i<f.length(); i++) descodificada += codifica(c2, c1, f.charAt(i));

		return descodificada;
	}

}
