package resueltas;

public class Resuelta14 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Palabra: ");
		String p, palabra=sc.nextLine();
		
		System.out.println("Ordena: "+anagramaDe(palabra));
		
		do{
		
			p=sc.nextLine();
			
			
		}while(!palabra.equals(p));
		
		System.out.println("Ganaste");
	}
	
	public static String anagramaDe(String p) {
		
		char[] anagrama= p.toCharArray();
		
		for(int i=0; i<anagrama.length; i++) {
			
			int indice=(int)(Math.random()*anagrama.length);
			
			char aux=anagrama[0];
			anagrama[0]=anagrama[indice];
			anagrama[indice]=aux;
			
		}
		
		return String.valueOf(anagrama);
	}
	
}
