package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados; 
	
	int cantidadAsientos() {
		int n = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				n++;
			}
		}
		return n;		
	}
	
	String verificarIntegridad() {
		String rc= "Auto original";
		String r= "Las piezas no son originales";
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null && asientos[i].registro != this.registro ) {
				return  r;
			}
			}
		if (this.registro != motor.registro) {
			return r;
		} else {
			return rc;
		}
		
	}
	
}
