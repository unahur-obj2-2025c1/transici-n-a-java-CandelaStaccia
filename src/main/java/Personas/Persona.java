package Personas;

import Planetas.Planeta;

public class Persona {
	private Integer edad;
	
	public Persona(Integer edad) {
		this.edad = edad; //aca sí se usa el this
	}
	
	public Integer getEdad() {
		return edad;
	}
	
	public void cumplirAnios() {
		edad = edad + 1;
	}
	
	public Integer inteligencia() {
		if(edad >= 20 && edad <= 40) {
			return 12;
		}
		else {
			return 8;
		}
		//return this.edad >= 20 && this.edad <= 40 ? 12 : 8;
    } //ternarias condicion ? lo que devuelve si se cumple : el else
    //se puede poner edad sin poner this
	
	public Integer potencia() {
		return 20;
	}
	
	public Boolean esDestacada() {
		return edad == 25 || edad == 35;
	}
	
	public void ofrecerTributo(Planeta planeta) {}
	
	public Integer valor() {
        return this.potencia() + this.inteligencia();
    }
}
