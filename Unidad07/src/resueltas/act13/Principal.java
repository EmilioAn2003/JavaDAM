package resueltas.act13;

public class Principal {

	public static void main(String[] args) {
		
		Pila p1 = new Pila();
		
		System.out.println(p1.desapilar()+"\n");
		
		p1.apilar(20); p1.apilar(12); p1.apilar(2); p1.apilar(50);
		
		p1.mostrar();
		
		System.out.println("\n"+p1.desapilar()+"\n"+p1.desapilar()+"\n");
		
		p1.mostrar();
		
	}

}
