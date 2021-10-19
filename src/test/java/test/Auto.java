package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados; 
	
	int cantidadAsiento() {
		int n = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				n= n++;
			}
		}
		return n;		
	}
	
	String verificarIdentidad() {
		String rc= "Auto original";
		String r= "Las piezas no son originales";
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i].registro != this.registro && asientos[i] != null ) {
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
