package resueltas;

public class Resuelta06 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Nombre completo: ");
		
		String sinVocales="", frase=sc.nextLine();
		
		for(int i=0; i<frase.length(); i++) {
			
			if(!isVocal(frase.charAt(i))) sinVocales+=frase.charAt(i);
			
		}
		
		System.out.println(sinVocales);
		
	}
	
	public static boolean isVocal(char c) {
		
		String vocales= "aeiouáéíóúü";
		
		if(vocales.indexOf(Character.toLowerCase(c))>=0) return true;
		
		return false;
		
	}
	
}
