package resueltas.act06;

public class Principal {

	public static void main(String[] args) {
		
		nSegundos(new Hora(0,0,0),20);
	}
	
	public static void nSegundos(Hora hora, int segundos) {
		
		if(segundos>=0) {
			System.out.println(hora.toString());
			
			hora.masUnSegundo();
			
			nSegundos(hora, segundos-1);
		}
	}

}
