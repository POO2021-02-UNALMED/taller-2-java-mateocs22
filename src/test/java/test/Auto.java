package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos= new Asiento[5];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados; 
	
	int cantidadAsiento() {
		int n = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i].getClass() == Asiento.class) {
				n= n++;
			}
		}
		return n;		
	}
	
	String verificarIdentidad() {
		String rc= "Auto original";
		String r= "Las piezas no son originales";
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i].registro != this.registro) {
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
