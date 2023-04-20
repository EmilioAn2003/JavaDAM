package resueltas;

public class Resuelta01 {
	
	public static void main(String[] args) {
		
		for(char c='\u0000'; c<='\u00ff'; c++) {
			System.out.println(Integer.toHexString(c)+" "+c);
		}
		
	}
}
