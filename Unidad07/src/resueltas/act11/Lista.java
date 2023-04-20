package resueltas.act11;

import java.util.Arrays;

public class Lista {
	
	Integer[] lista;
	
	public Lista() { lista = new Integer[0]; }
	
	public int nElementos() { return lista.length; }
	
	private int ultimoIndice() { return nElementos()-1; }
	
	private boolean existeIndice(int i) { return ultimoIndice() >= i && i >= 0; }
			
	private void dimensionar(int n) { lista = Arrays.copyOf(lista, nElementos()+n); }

	private void desplazar(int i, int mover) { 
		if(mover>0)System.arraycopy(lista, i, lista, i+mover, nElementos() - ( i + mover) );
		if(mover<0)System.arraycopy(lista, i-mover, lista, i, nElementos() - ( i - mover) );
	}
	
	public void reemplazar(int i, Integer integer) { if(existeIndice(i)) lista[i] = integer; }
	
	public void insertar(int i, Integer integer) {
		
		boolean existe = existeIndice(i);
		
		if( existe ) dimensionar( 1 ); 
		if(!existe ) dimensionar( i - ultimoIndice() );
		
		if(i != ultimoIndice()) desplazar(i, 1);
		
		reemplazar(i, integer);
	}
	
	public void terminarCon( Integer integer) { insertar( nElementos(), integer); }
	
	public void empezarCon( Integer integer) { insertar(0, integer); }
	
	public void terminarCon(Lista lista) { for(Integer integer: lista.lista) { terminarCon(integer); } }
	
	public Integer eliminar(int i) { 
		Integer integer = dameIndice(i);
		if( integer != null) {
			desplazar(i,-1);
			dimensionar( -1 ); 
		}
		return integer;
	}
	
	public Integer dameIndice(int i) { 
		if(existeIndice(i)) return lista[i]; 
		return null;
	}
	
	public int buscar(Integer integer) {
		for(int i=0; i<nElementos(); i++) if(dameIndice(i).equals(integer)) return i;
		return -1;
	}
	
	public void mostrar() { for(Integer integer: lista) System.out.println(integer); }
	
	
}
