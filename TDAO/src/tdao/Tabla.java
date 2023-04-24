package tdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tabla {
	
	private Connection con;
	private String TABLE_NAME;
	private String TABLE_SCHEMA;
	
	private List<String> COLUMN_NAMES;
	private int ORDINAL_POSITION;
	private String DATA_TYPE;
	
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	public Tabla( String tabla, Connection con, String schema) throws SQLException {
		
		this.con = con;
		this.TABLE_NAME = tabla;
		this.TABLE_SCHEMA = schema;

		nombrarColumnas();
	}
	
	private void nombrarColumnas() throws SQLException {
		
		COLUMN_NAMES = new ArrayList<String>();
		
		sql = "SELECT COLUMN_NAME "
			+ "FROM INFORMATION_SCHEMA.COLUMNS "
			+ "WHERE table_schema = ? AND TABLE_NAME = ?";

		ps = con.prepareStatement(sql);
		
		ps.setString(1, TABLE_SCHEMA);
		ps.setString(2, TABLE_NAME);
		
		rs = ps.executeQuery();
		
		while(rs.next()) COLUMN_NAMES.add(rs.getString(1));
	}
	
	private void infoColumna(String column_name) throws SQLException {
		
		sql = "SELECT ORDINAL_POSITION, DATA_TYPE "
			+ "FROM INFORMATION_SCHEMA.COLUMNS "
			+ "WHERE table_schema = ? AND TABLE_NAME = ? AND COLUMN_NAME = ?";
	
		ps = con.prepareStatement(sql);
		
		ps.setString(1, TABLE_SCHEMA);
		ps.setString(2, TABLE_NAME);
		ps.setString(3, column_name);
		
		rs = ps.executeQuery();
		
		if(rs.next()) ORDINAL_POSITION = rs.getInt(1); DATA_TYPE = rs.getString(2);
		
	}
	
	private void setPs( String column_name, Registrable r) throws SQLException {
		
		infoColumna(column_name); 
		setPs( ORDINAL_POSITION, ORDINAL_POSITION, r);
	}
	
	private void setPs( int position_sql, int ordinal_position, Registrable r) throws SQLException {

		if( DATA_TYPE.equals("VARCHAR") ) ps.setString(position_sql, (String) r.variables().get(ordinal_position-1));
		if( DATA_TYPE.equals("NUMBER") ) ps.setInt(position_sql, (int) r.variables().get(ordinal_position-1));

	}

	private void preparedInsert() {
		
		sql = "INSERT INTO ? VALUES (";
		
		for(int i=1; i<=COLUMN_NAMES.size(); i++ ) { sql += "?"; if( i != COLUMN_NAMES.size()) sql += ", "; } 
		
		sql += ")";
	}
		
	
	public void insertar(Registrable r) throws SQLException {
		
		preparedInsert(); ps = con.prepareStatement(sql);
		
		ps.setString(1, TABLE_NAME);
		
		for(String c: COLUMN_NAMES) setPs( c,  r);
		
		ps.executeUpdate();
		
	}
	
	public void eliminar(String column_name, Registrable r) throws SQLException {
		
		sql = "DELETE FROM ? WHERE ? = ?";

		ps = con.prepareStatement(sql);
		
		ps.setString(1, TABLE_NAME);
		ps.setString(2, column_name);
		
		infoColumna(column_name); 
		setPs( 3, ORDINAL_POSITION, r);
		
		ps.executeUpdate();
		
	}
	
	private void preparedUpdate() {
		
		sql = "UPDATE ? SET ";
			
		for(int i=1; i<COLUMN_NAMES.size(); i++ ) { sql += "? = ?"; if( i != COLUMN_NAMES.size()) sql += ", "; } 
		
		sql += "WHERE ? = ?";
	}
	
	public void modificar(String column_name, Registrable r) throws SQLException {
		
		preparedUpdate(); ps = con.prepareStatement(sql);
		
		infoColumna(column_name); int ordinal_position = ORDINAL_POSITION;
		
		ps.setString(1, TABLE_NAME);
		
		for(String c: COLUMN_NAMES) {
			
			infoColumna(c);
			int position_sql_name=ORDINAL_POSITION*2;
			
			if(ordinal_position < ORDINAL_POSITION){ position_sql_name += 0; }
			if(ordinal_position > ORDINAL_POSITION){ position_sql_name -= 2; }
			if( ordinal_position == ORDINAL_POSITION) { position_sql_name = COLUMN_NAMES.size()*2; }
			
			ps.setString(position_sql_name, c);
			setPs(position_sql_name+1, ORDINAL_POSITION, r);
		}
		
		ps.executeUpdate();
		
	}		
}
