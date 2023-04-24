package tdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	
	private String url;
	private String user;
	private String password;
	private String schema;
	
	private Connection con;
	
	public DataBase(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
		this.schema = url.substring(url.lastIndexOf("/"),url.length());
	}

	public boolean isConectado(){ 
		try { return con.isClosed();
		} catch (SQLException e) { return false; }
	}

	public boolean conectar() {
		try { con = DriverManager.getConnection(url,user,password); } 
		catch (SQLException e) { e.printStackTrace();}
		return isConectado();
	}
	
	public boolean desconectar() { 
		try { con.close(); }
		catch (SQLException e) { e.printStackTrace();}
		return isConectado();
	}
	
	public Tabla dameTabla(String nombre){ 
		try { return new Tabla( nombre, con, schema); }
		catch (SQLException e) { return null; } 
	}
}
	/* Obtiene un listado de nombres de las tablas en la base de datos
SELECT DISTINCT TABLE_NAME
FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_schema = 'BClientes';
	 * 
	 * Obtiene el numero de tablas en la base de datos
SELECT COUNT( DISTINCT TABLE_NAME)
FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_schema = 'BClientes';
	 * 
	 * Obtiente un listado de nombres de las columnas en la tabla
SELECT COLUMN_NAME
FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_schema = 'BClientes' AND TABLE_NAME = 'TClientes';
	 *
	 * Obtiene el numero de columnas en la tabla
SELECT COUNT(COLUMN_NAME)
FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_schema = 'BClientes' AND TABLE_NAME = 'TClientes';
	 *
	 * Obtiene el tipo de dato que es cierta columna de esa tabla
SELECT DATA_TYPE
FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_schema = 'BClientes' AND TABLE_NAME = 'TClientes' AND ORDINAL_POSITION = 1;
	 *
	 * Obtiene el numero de orden por el nombre de  la columna
SELECT ORDINAL_POSITION
FROM INFORMATION_SCHEMA.COLUMNS
WHERE table_schema = 'BClientes' AND TABLE_NAME = 'TClientes' AND COLUMN_NAME = "IdCliente";
	 */

