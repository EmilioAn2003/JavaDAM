package resueltas;

public class Resuelta07 {
	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.print("Frase: ");
		String frase = sc.nextLine();
		
		System.out.print("Palabra: ");
		String palabra = sc.nextLine();
		
		int contador=0, indice=-1;
		
		do {
			
			indice=frase.indexOf(palabra, indice+1);
			if(indice!=-1)contador++;
			
		}while(indice!=-1);
	
		System.out.println("Contador: "+contador);
	}
}
