package resueltas.act01_05;

public class Gestor {
	
	public String nombre;
	private String telefono;
	double importeMaximo;
	
	public Gestor(String nombre, String telefono, double importeMaximo) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMaximo = importeMaximo;
	}
	
	public Gestor(String nombre, String telefono) {
		this(nombre, telefono, 10000);
	}

	public String getTelefono() { return telefono; }
	
	
}
