package resueltas.act08;

public class Principal {

	public static void main(String[] args) {
		
		SintonizadorFM SFM1 = new SintonizadorFM(107.5);
		SintonizadorFM SFM2 = new SintonizadorFM();
		System.out.println(SFM1.display()+" "+SFM2.display());
		
		SFM1.up(); SFM2.down();
		System.out.println(SFM1.display()+" "+SFM2.display());
		
		SFM1.up(); SFM2.down();
		System.out.println(SFM1.display()+" "+SFM2.display());
	}

}
