package aplicacion;

import patron.Tabla;
import patron.BD;

import java.sql.SQLException;


public class ClienteDAO{
	
	private String url = "jdbc:mysql://localhost:3306/BClientes";
	private String user = "root";
	private String password = "";
	
	private Tabla TClientes;
	
	public ClienteDAO() {
		
		BD bd= new BD( url, user, password);
		
		try { TClientes = bd.dameTabla("TClientes");
		} catch (SQLException e) { e.printStackTrace(); }
		
	}
	
	public boolean eliminar(String campo, Cliente cliente) {
		
		try { TClientes.eliminar(campo, cliente); return true;
		} catch (SQLException e) { return false; }
		
	}
	
	public boolean insertar( Cliente cliente) {
		
		try { TClientes.insertar( cliente); return true;
		} catch (SQLException e) { return false; }
		
	}
	
	
}
