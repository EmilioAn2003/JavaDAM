package resueltas.act01_05;

public class CuentaCorriente {

	String dni;
	public String nombre;
	private double saldo;
	private static String banco = "BCP";
	private Gestor gestor;
	
	
	public CuentaCorriente(String dni, String nombre, double saldo, Gestor gestor) {
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.gestor = gestor;
	}

	public CuentaCorriente(String dni, String nombre) {
		this(dni, nombre, 0, null);
	}
	
	public CuentaCorriente(String dni, double saldo) {
		this(dni, null, saldo, null);
	}
	
	public double retirarSaldo(double saldo) {
		
		if(this.saldo<saldo) {
			System.out.println("Saldo insuficiente");
			return 0;
		}
		
		this.saldo -= saldo;
		return saldo;
	}
	
	public void ingresarSaldo(double saldo) {
		this.saldo += saldo;
	}

	public String mostrarInformacion() {
		return dni + " | " + nombre + " | " + saldo;
	}

	public static String getBanco() { return banco; }
	public static void setBanco(String banco) { CuentaCorriente.banco = banco; }

	public Gestor getGestor() { return gestor; }
	public void setGestor(Gestor gestor) { this.gestor = gestor; }
	
	
	
}
