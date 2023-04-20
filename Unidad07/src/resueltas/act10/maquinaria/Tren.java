package resueltas.act10.maquinaria;

import java.util.Arrays;

import resueltas.act10.personal.Maquinista;

public class Tren {
	
	Locomotora locomotora;
	static int vagonesMax = 5;
	Vagon[] vagones;
	Maquinista maquinista;
	
	public Tren(Locomotora locomotora, Maquinista maquinista) {
		this.locomotora = locomotora;
		this.maquinista = maquinista;
		this.vagones = new Vagon[0];
	}
	
	public void unVagonMas(Vagon vagon) {
		if(vagones.length<vagonesMax) vagones=Arrays.copyOf(vagones,vagones.length+1); vagones[vagones.length-1]=vagon;
	}
	
}
