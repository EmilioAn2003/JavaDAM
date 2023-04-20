package aplicacion.act12;

public class Ecuacion2doGrado {
	
	private double a;
	private double b;
	private double c;
	private Double x1;
	private Double x2;
	private double discriminante;
	
	public Ecuacion2doGrado(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		calcular();
	}
	
	private void discriminante() { discriminante = (b * b) - (4 * a * c); }
	
	public double getDiscriminante() { return discriminante; } 	
	
	public boolean discriminantePositivo() { return discriminante >= 0; }
	
	private void x1() { if(discriminantePositivo()) x1 = (- b + Math.sqrt(discriminante) ) / (2*a); }
	private void x2() { if(discriminantePositivo()) x2 = (- b - Math.sqrt(discriminante) ) / (2*a); }
	
	public Double getX1() { return x1; } 		public Double getX2() { return x2; } 	
	
	private void calcular() { discriminante(); x1(); x2(); }
	
	@Override
	public String toString() { 
		return "a: "+a+" | b: "+b+" | c: "+c+" | discriminante: "+discriminante+" | x1: "+x1+" | x2: "+x2; 
	}
	
	public double getA() { return a; } 		public void setA(double a) { this.a = a; calcular(); }
	public double getB() { return b; } 		public void setB(double b) { this.b = b; calcular(); }
	public double getC() { return c; } 		public void setC(double c) { this.c = c; calcular(); }
	
	
}
