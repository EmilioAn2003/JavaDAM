package resueltas;

public class Resuelta02 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		int a= sc.next().length();
		int b= sc.next().length();
		
		if(a<b) System.out.println(-1);
		if(b<a) System.out.println(1);
		if(b==a) System.out.println(0);
	}

}
