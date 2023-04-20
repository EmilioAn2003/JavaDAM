package aplicacion.act12;

public class Principal {

	public static void main(String[] args) {
		
		Ecuacion2doGrado e1 = new Ecuacion2doGrado( 6, -2, 0);
		System.out.println(e1.toString());
	
		Ecuacion2doGrado e2 = new Ecuacion2doGrado( 2, -4, 2);
		System.out.println(e2.toString());
		
		Ecuacion2doGrado e3 = new Ecuacion2doGrado( 9, 0, 2);
		System.out.println(e3.toString());
	}
	
}
