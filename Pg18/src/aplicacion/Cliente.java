package aplicacion;

import java.util.ArrayList;

import patron.Registrable;

public class Cliente implements Registrable{
	
	private String idCliente;
	private String nombre;
	private String password;
	
	public Cliente(){}
	
	public Cliente(String idCliente, String nombre, String password) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.password = password;
	}

	public String getIdCliente() { return idCliente; }
	public void setIdCliente(String idCliente) { this.idCliente = idCliente; }

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }

	public String getPassword() { return password; }

	public void setPassword(String password) { this.password = password; }

	public ArrayList<Object> variables(){ 
		
		ArrayList<Object> variables = new ArrayList<>();
			
		variables.add(idCliente);
		variables.add(nombre);
		variables.add(password);
		
		return variables; 
	}
}
