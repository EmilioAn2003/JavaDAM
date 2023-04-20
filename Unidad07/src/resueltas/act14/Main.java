package resueltas.act14;

import java.util.Arrays;

public class Main {
	
	private int[] lista;
	
	public static void main(String[] args) {
		
		Main m = new Main();
		
		for(int i=1; i<=10; i++) m.insertarFinal(i);
		
		System.out.println(Arrays.toString(m.lista));
	}
	
	void insertarFinal(int nuevo) {
		if(lista == null) lista = new int[0];
		lista = Arrays.copyOf(lista, lista.length+1);
		lista[lista.length-1] = nuevo;
	}
	
}
