package patron;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tabla {
	
	private Connection con;
	private String tabla;
	private String schema;
	
	private List<String> columnas;
	private int nColumna;
	private String tipoDato;
	
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	public Tabla( String tabla, Connection con, String schema) throws SQLException {
		
		this.con = con;
		this.tabla = tabla;
		this.schema = schema;

		nombrarColumnas();
	}
	
	private void nombrarColumnas() throws SQLException {
		
		columnas = new ArrayList<String>();
		
		sql = "SELECT COLUMN_NAME\n"
			+ "FROM INFORMATION_SCHEMA.COLUMNS\n"
			+ "WHERE table_schema = ? AND TABLE_NAME = ?";

		ps = con.prepareStatement(sql);
		
		ps.setString(1, schema);
		ps.setString(2, tabla);
		
		rs = ps.executeQuery();
		
		while(rs.next()) columnas.add(rs.getString(1));
	}
	
	private void infoColumna(String columna) throws SQLException {
		
		sql = "SELECT ORDINAL_POSITION, DATA_TYPE "
			+ "FROM INFORMATION_SCHEMA.COLUMNS "
			+ "WHERE table_schema = ? AND TABLE_NAME = ? AND COLUMN_NAME = ?";
	
		ps = con.prepareStatement(sql);
		
		ps.setString(1, schema);
		ps.setString(2, tabla);
		ps.setString(3, columna);
		
		rs = ps.executeQuery();
		
		if(rs.next()) nColumna = rs.getInt(1); tipoDato = rs.getString(2);
		
	}
	
	private void setPs( String columna, Registrable r) throws SQLException {
		
		infoColumna(columna); 
		setPs( nColumna, nColumna-1, r);
	}
	
	private void setPs( int nPs, int nR, Registrable r) throws SQLException {
		
		if( tipoDato.equals("VARCHAR") ) ps.setString(nPs, (String) r.variables().get(nR));
		if( tipoDato.equals("NUMBER") ) ps.setInt(nPs, (int) r.variables().get(nR));

	}

	private void preparedInsert() {
		
		sql = "INSERT INTO ? VALUES (";
		
		for(int i=1; i<=columnas.size(); i++ ) { sql += "?"; if( i != columnas.size()) sql += ", "; } 
		
		sql += ")";
	}
		
	
	public void insertar(Registrable r) throws SQLException {
		
		preparedInsert();
		
		ps = con.prepareStatement(sql);
		
		ps.setString(1, tabla);
		
		for(String c: columnas) setPs( c,  r);
		
		ps.executeUpdate();
		
	}
	
	public void eliminar(String columna, Registrable r) throws SQLException {
		
		sql = "DELETE FROM ? WHERE ? = ?";

		ps = con.prepareStatement(sql);
		
		ps.setString(1, tabla);
		ps.setString(2, columna);
		setPs( columna,  r);
		
		ps.executeUpdate();
		
	}
	
	private void preparedUpdate() {
		
		sql = "UPDATE ? SET ";
			
		for(int i=1; i<columnas.size(); i++ ) { sql += "? = ?"; if( i != columnas.size()) sql += ", "; } 
		
		sql += "WHERE ? = ?";
	}
	
	public void modificar(String columna, Registrable r) throws SQLException {
		
		preparedUpdate();
		
		ps = con.prepareStatement(sql);
		
		infoColumna(columna); 
		int compara = nColumna;
		
		ps.setString(1, tabla);
		
		for(String c: columnas) {
			
			infoColumna(c);
			
			if( compara == nColumna) {
				ps.setString(columnas.size()*2, c);
				setPs(columnas.size()*2+1, compara-1, r);
			}else {
				int nC; int nPs;
				
				if(compara > nColumna) { nPs = nColumna*2; nC = nColumna*2+1; }
				else { nPs = nColumna*2-2; nC = nColumna*2-1; }
				
				ps.setString(nPs, c);
				setPs(nC, nColumna-1, r);
			}
		}
		
		ps.setString(columnas.size()*2, tabla);
		
		ps.executeUpdate();
		
	}
	
}
