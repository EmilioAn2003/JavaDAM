package aplicacion;

public class Aplicacion12 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Jugador A: ");
		
		String A = sc.nextLine();
		String B = null;
		
		int fallos=0;
		
		B = insertChar(A, B, ' ');
		
		do{
			
			System.out.println(B);
			
			char c = sc.nextLine().charAt(0);
			
			if( A.indexOf(c)<0 ) fallos++;
			
			B = insertChar(A, B, c);
			
		}while(!A.equals(B) && fallos<7);
		
		System.out.println( A +" | Fallos: "+ fallos +" | "+ (fallos<7 ? "Ganaste" : "Perdiste") );
	}
	
	public static String insertChar(String A, String B, char c) {
		
		String pista = "";
		
		for(int i=0; i<A.length(); i++) {
			
			char a = A.charAt(i), b = '?';
			if( !(B==null) )   b = B.charAt(i);
			
			b = c != a ? b : a;
			pista += b;
			
		}
		
		return pista;
	}
}
