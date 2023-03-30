package ejercicio10;

public class Palabra{
	
	private int id;
	private String Espanyol;
	private String Ingles;

	public Palabra(int id, String Espanyol, String Ingles) {
		this.id=id;
		this.Espanyol = Espanyol;
		this.Ingles = Ingles;
	}
	
	public Palabra(String Espanyol, String Ingles) {
		this.Espanyol = Espanyol;
		this.Ingles = Ingles;
	}
	
	public String getEspanyol() { return Espanyol; }
	public void setEspanyol(String pEspanyol) { this.Espanyol = pEspanyol; }
	public String getIngles() { return Ingles; }
	public void setIngles(String Ingles) {	this.Ingles = Ingles;}
	public int getId() { return id;}
	public void setId(int id) { this.id = id;}
	//...

	public String toString() {
		return "Traduccion: "+ Espanyol+", "+Ingles;
	}

}
