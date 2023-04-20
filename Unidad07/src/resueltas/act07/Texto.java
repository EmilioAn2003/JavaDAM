package resueltas.act07;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
	
	private String texto;
	private final int longitudMax;
	private LocalDate creacion;
	private LocalDateTime modificacion;
	private final static String VOCALES= "aeiouáéíóúü";
	
	
	
	public Texto(String texto, int longitudMax) {
		this.texto = texto;
		this.longitudMax = longitudMax;
		this.creacion = LocalDate.now();
	}

	public Texto(int longitudMax) {
		this("", longitudMax);
	}
	
	
	
	public String getTexto() { return texto; }

	public boolean hayEspacioPara(char c) { return texto.length() + 1 <= longitudMax; }
	public void startWith(char c) { if( this.hayEspacioPara(c) ) texto = c + texto; modificacion(); }
	public void endWith(char c) { if( this.hayEspacioPara(c) ) texto = texto + c; modificacion(); }
	
	public boolean hayEspacioPara(String s) { return texto.length() + s.length()  <= longitudMax; }
	public void startWith(String s) { if( this.hayEspacioPara(s) ) texto = s + texto; modificacion(); }
	public void endWith(String s) { if( this.hayEspacioPara(s) ) texto = texto + s; modificacion(); }
	
	private void modificacion() { modificacion = LocalDateTime.now(); }
	
	public int nVocales() {
		
		int vocales = 0;

		for(int i=0; i < texto.length(); i++) if( esVocal( texto.charAt(i) ) ) vocales++;

		return vocales;
	}
	
	private boolean esVocal(char c) { return VOCALES.indexOf(Character.toLowerCase(c))>=0; }

	@Override
	public String toString() {
		return nVocales() + " vocales  | longitud maxima de " + longitudMax + " | creacion: " + creacion
				+ " | modificacion: " + modificacion;
	}
	
	
}
