package ejercicio10;

import java.io.*;

public class Fichero {
	
	private String nombre;
	private BufferedWriter bw;
	private String direccion;
	
	public Fichero(String direccion) {
		try {
			this.nombre=direccion.substring(direccion.lastIndexOf("/"), direccion.length());
			this.direccion=direccion;
			this.bw= new BufferedWriter(new FileWriter(direccion));
		}catch(Exception ex) {
			System.out.println("Error de creacion de fichero");
		}
	}
	
	public void addLine(String linea) {
		try {
			bw.write(linea);
			bw.newLine();
			bw.flush();
		}catch(Exception ex) {
			System.out.println("Error de escitura del fichero");
		}
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public BufferedWriter getBw() {return bw;}
	public void setBw(BufferedWriter bw) {this.bw = bw;}
	public String getDireccion() {return direccion;}
	public void setDireccion(String direccion) {this.direccion = direccion;}
	
	
	
}
