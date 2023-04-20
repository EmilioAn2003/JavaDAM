package resueltas.act06;

public class Hora {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora(int hora, int minuto, int segundo) {
		
		if(segundo<60) {
			this.segundo = segundo;
		}else {
			this.segundo = segundo % 60;
			minuto += segundo/60;
		}
		
		if(minuto<60) {
			this.minuto = minuto;
		}else {
			this.minuto = minuto % 60;
			hora += minuto/60;
		}
		
		if(hora<24) {
			this.hora = hora;
		}else {
			this.hora = hora % 24;
		}
	}

	public int getHora() { return hora; }
	public void setHora(int hora) { 
		if(hora<24) this.hora = hora;
		else this.hora = hora % 24;
	}

	public int getMinuto() { return minuto; }
	public void setMinuto(int minuto) { 
		if(minuto<60) {
			this.minuto = minuto;
		}else {
			this.setHora(this.getHora()+ minuto/60);
			this.minuto = minuto % 60;
		}
	}

	public int getSegundo() { return segundo; }
	public void setSegundo(int segundo) { 
		if(segundo<60) {
			this.segundo = segundo;
		}else {
			this.setMinuto(this.getMinuto()+ segundo/60);
			this.segundo = segundo % 60;
		}
	}
	
	public void masUnSegundo() { this.setSegundo(this.getSegundo()+1); }

	@Override
	public String toString() {
		return  hora + ":" + minuto + ":" + segundo;
	}
	
	

}
