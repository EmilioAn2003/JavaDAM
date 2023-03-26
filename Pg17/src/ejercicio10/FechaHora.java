package ejercicio10;

import java.util.Date;

public class FechaHora {
	
	private int anyo;
	private int mes;
	private int dia;
	
	private int hora;
	private int minuto;
	
	public FechaHora(int anyo, int mes, int dia, int hora, int minuto) {
		this.anyo = anyo;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}

	public FechaHora(Date f) {
		this( f.getYear()+1900, f.getMonth()+1 , f.getDate(), f.getHours(), f.getMinutes());
	}

	@Override
	public String toString() {
		return anyo + "-" + mes + "-" + dia + " " + hora + ":" + minuto;
	}
	
	
	
}
