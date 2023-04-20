package resueltas.act09;

public class Principal {

	public static void main(String[] args) {
		
		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla(true);
		
		System.out.println(b1.toString()+" "+b2.toString());
		
		b1.encender(); b2.apagar();
		System.out.println(b1.toString()+" "+b2.toString());
		
		Bombilla.general=false; b2.encender();
		System.out.println(b1.toString()+" "+b2.toString());
	
		Bombilla.general=true;
		System.out.println(b1.toString()+" "+b2.toString());
	}

}
