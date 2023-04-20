package resueltas.act08;

public class SintonizadorFM {
	
	private static double mhzMin = 80;
	private static double mhzMax = 108;
	private double mhz;
	
	public SintonizadorFM(double mhz) {
		this.mhz = mhz;
	 	compruebaRango();
	}
	public SintonizadorFM() {
		this(80);
	}
	
	private void compruebaRango() {
		if(this.mhz < mhzMin) this.mhz = mhzMax;
		if(this.mhz > mhzMax) this.mhz = mhzMin;
	}
	
	public void up() { 
		this.mhz += 0.5;
		compruebaRango();
	}
	public void down() { 
		this.mhz -= 0.5;
		compruebaRango();
	}
	
	public double display() { return mhz; }

}
