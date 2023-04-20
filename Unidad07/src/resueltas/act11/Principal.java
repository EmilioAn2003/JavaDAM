package resueltas.act11;

public class Principal {

	public static void main(String[] args) {
		
		Lista l1=new Lista();
		Lista l2=new Lista();
		
		l1.terminarCon(5);
		l1.empezarCon(3);
		l1.terminarCon(6);
		l1.empezarCon(2);
		
		
		l1.insertar(0, 1);
		l1.insertar(5, 7);
		l1.insertar(3, 4);
		
		//l1.mostrar();
		
		System.out.println("--------------");
		
		l2.empezarCon(13);
		l2.terminarCon(15);
		l2.empezarCon(12);
		l2.terminarCon(16);
		
		l2.insertar(0, 8);
		
		l2.reemplazar(1, 9);
		l2.reemplazar(2, 10);
		
		l2.eliminar(3);
		l2.eliminar(3);
		l2.eliminar(3);
		l2.eliminar(3);
		l2.eliminar(3);
		
		//l2.mostrar();
		
		System.out.println("--------------");
		
		l1.terminarCon(l2);
		
		l1.mostrar();
	}

}
