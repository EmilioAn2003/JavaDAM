package resueltas.act10.maquinaria;

import resueltas.act10.personal.Mecanico;

public class Locomotora {
	
	String matricula;
	int potencia;
	int anyoFabricacion;
	Mecanico mecanico;
	
	Locomotora(String matricula, int potencia, int anyoFabricacion, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.anyoFabricacion = anyoFabricacion;
		this.mecanico = mecanico;
	}
}
