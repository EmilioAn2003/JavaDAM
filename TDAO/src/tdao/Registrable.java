package tdao;

import java.util.ArrayList;

public interface Registrable{
	
	default ArrayList<Object> variables(){return new ArrayList<Object>(); }
		
}
