package resueltas.act09;

public class Bombilla {
	
	public static boolean general=true;
	private boolean prendida;
	
	public Bombilla(boolean prendida) { this.prendida = prendida; }
	public Bombilla() { this(false); }
	
	public void encender() { prendida = true; }
	public void apagar() { prendida = false; }
	public boolean estado() { return general && prendida; }
	
	@Override
	public String toString() {
		return "prendida: " + estado();
	}
}
