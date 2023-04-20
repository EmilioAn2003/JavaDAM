package aplicacion;

public class Aplicacion13 {

	public static void main(String[] args) {
		
		String sentencia =" if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		
		System.out.println(sentencia);
		
		sentencia= eliminarComentariosDe(sentencia);
		
		System.out.println(sentencia);
	}
	
	public static String eliminarComentariosDe(String sentencia) {
		
		String sinComentarios="";
		
		int inicio = sentencia.indexOf("/*");
		
		while(inicio>0) {
			
			sinComentarios += sentencia.substring(0, inicio);
			
			int fin = sentencia.indexOf("*/");
			
			sentencia = sentencia.substring(fin+2, sentencia.length());
			
			inicio = sentencia.indexOf("/*");
		}
		
		return sinComentarios;
	}

}
