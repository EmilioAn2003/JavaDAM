package ejercicio10;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FicheroBDiccionario extends Fichero {
	
	private static final long serialVersionUID = 1L;
	private Connection con;

	public FicheroBDiccionario(String direccion, String nombre,Connection con) {
		super(direccion, nombre);
		this.con=con;
	}
	
	public void ejecutar() {
		
		while(this.readyToRead()) {
			
			String [] p = this.readLine().split("_");
			
			insertPalabra(new Palabra( p[0].toUpperCase(), p[1].toUpperCase()));
			
		}
	}
	
	private void insertPalabra(Palabra p) {
		try {
			
			String insert="INSERT INTO `TPalabras` VALUES (?,?,?)";
			PreparedStatement ps = con.prepareStatement(insert);
			
			ps.setString(1, null);
			ps.setString(2, p.getEspanyol());
			ps.setString(3, p.getIngles());
			
			ps.executeUpdate();
			
		}catch(Exception ex) {
			
			System.out.println("Error de Insert");
			
		}
	}
}
