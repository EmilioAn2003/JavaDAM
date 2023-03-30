package ejercicio10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Fichero  extends File {
	
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	private BufferedReader br;
	private BufferedWriter bw;
	private String direccion;
	
	public Fichero(String direccion, String nombre) {
		
		super(direccion, nombre);
		
		this.nombre=nombre;
		this.direccion=direccion;
		
		try {
			
			this.createNewFile();
			
			this.bw= new BufferedWriter(new FileWriter(this, true));
			this.br= new BufferedReader(new FileReader(this));
			
		}catch(Exception ex) {
			
			System.out.println("Error en creacion del fichero");
		
		}
	}
	
	public void writeLine(String linea) {
		try {
			
			bw.write(linea);
			bw.newLine();
			bw.flush();
			
		}catch(Exception ex) {
			
			System.out.println("Error de escitura del fichero");
			
		}
	}
	
	public String readLine() {
		try {
			
			return br.readLine();
			
		} catch (Exception ex) { return null; }
	}
	
	public boolean readyToRead() {
		try {
			
			return br.ready();
			
		} catch (Exception ex) { return false; }
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public BufferedWriter getBw() {return bw;}
	public void setBw(BufferedWriter bw) {this.bw = bw;}
	public BufferedReader getBr() {return br;}
	public void setBr(BufferedReader br) {this.br = br;}
	public String getDireccion() {return direccion;}
	public void setDireccion(String direccion) {this.direccion = direccion;}
	
	
	
}
