package aplicacion;

public class Aplicacion18 {

	public static void main(String[] args) {
		
		String frase = pedirString("Frase: ");
		
		System.out.println(aCarmel(frase));
		
	}
	
	public static String pedirString(String pregunta) {
		
		System.out.print(pregunta);
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		String respuesta= sc.nextLine();
		
		sc.close();
		
		return respuesta;
		
	}
	
	public static String aCarmel(String frase) {
		
		String[] palabras=frase.split(" ");
		
		String carmel=null;
		
		for(String p:palabras) {
			
			if(carmel==null) { 
				carmel = p.toLowerCase();
			}else {
				carmel += Character.toUpperCase(p.charAt(0));
				carmel += p.substring(1, p.length()).toLowerCase();
			}
		}
		
		return carmel;
	}
}
