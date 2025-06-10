package Arma;

import Personas.Soldado;

public class Pistolete implements Arma {
	private Integer largo;
	
	public Pistolete(Integer largo) {
        this.largo = largo;
    }
	
	public Integer potencia(Soldado soldado) {
        return soldado.getEdad() > 30 ? largo * 3 : largo * 2;
    }
}
