package test;

public class Motor {
	int numerodeCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "normal") {
			this.tipo = tipo;
		}
	}

}
