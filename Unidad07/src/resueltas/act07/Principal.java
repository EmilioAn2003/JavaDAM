package resueltas.act07;

public class Principal {

	public static void main(String[] args) {
		
		Texto t = new Texto(10);
		
		t.startWith("Hola");
		t.endWith(" a ");
		t.endWith("bye");
		t.endWith('A');
		
		
		System.out.println(t.getTexto());
		
		System.out.println(t.toString());
	}

}
