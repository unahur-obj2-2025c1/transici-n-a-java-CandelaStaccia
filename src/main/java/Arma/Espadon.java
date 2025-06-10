package Arma;

import Personas.Soldado;

public class Espadon implements Arma {
	private Integer peso;
	
	public Espadon(Integer peso) {
        this.peso = peso;
    }
	
	public Integer potencia(Soldado soldado) {
        return soldado.getEdad() < 40 ? peso / 2 : 6;
    }
}
