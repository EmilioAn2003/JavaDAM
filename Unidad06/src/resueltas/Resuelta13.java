package resueltas;

public class Resuelta13 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Frase: ");
		String frase=sc.nextLine();
		
		for(char c='a'; c<='z' ; c++) {
			
			int cuenta=contarLetraEn(frase, c);
			
			if(cuenta>0) System.out.println(c+": "+cuenta);
		}
		
	}
	
	public static int contarLetraEn(String p, char c) {
		
		int contador=0;
		
		for(char caracter:p.toCharArray()) if(Character.toLowerCase(caracter)==c) contador++;
		
		return contador;
	}

}
