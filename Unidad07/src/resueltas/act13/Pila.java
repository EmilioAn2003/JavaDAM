package resueltas.act13;

import resueltas.act11.Lista;

public class Pila {
	
	private Lista lista;
	
	public Pila() { lista = new Lista(); }
	
	public void apilar(Integer integer) { lista.terminarCon(integer); }
	
	public Integer desapilar() { return lista.eliminar(lista.nElementos()-1); }

	public void mostrar() { lista.mostrar(); }
}
