package resueltas;

public class Resuelta12 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		String p1=sc.nextLine();
		String p2=sc.nextLine();
		
		System.out.println(isAnagrama(p1,p2)?"Es anagrama":"No es anagrama");

	}
	
	public static boolean isAnagrama(String p1, String p2) {
		
		if(p1.length()!=p2.length()) return false;
		
		for(char c:p1.toCharArray()) if(contarLetraEn(p1, c)!=contarLetraEn(p2, c)) return false;
		
		return true;
	}
	
	public static int contarLetraEn(String p, char c) {
		
		int contador=0;
		
		for(char caracter:p.toCharArray()) if(caracter==c) contador++;
		
		return contador;
	}
}
