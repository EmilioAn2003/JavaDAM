package resueltas.act10.personal;

public class Mecanico {
	
	String nombre;
	String telefono;
	enum Especialidad{ frenos, hidraulica, electricidad, motor };
	Especialidad especialidad;
	
	public Mecanico(String nombre, String telefono, String especialidad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = Especialidad.valueOf(especialidad);
	}
	
	
	
}
