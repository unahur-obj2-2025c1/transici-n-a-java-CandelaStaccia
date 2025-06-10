package Personas;

import Planetas.Planeta;

public class Atleta extends Persona {
	private Integer masaMuscular = 4; //double?
	private Integer tecnicasConocidas = 2;
	
	//poner constructor?
	public Atleta(Integer edad, Integer masaMuscular, Integer tecnicasConocidas) {
		super(edad);
		this.masaMuscular = masaMuscular;
		this.tecnicasConocidas = tecnicasConocidas;
	}
	
	public Atleta(Integer edad) {
		super(edad);
	}
	
	public Atleta(Integer edad, Integer tecnicasConocidas) {
		super(edad);
		this.tecnicasConocidas = tecnicasConocidas;
	}
	
	
	@Override //para sobreescribir 
	public Integer potencia() {
		return super.potencia() + masaMuscular * tecnicasConocidas;
	} //super.metodo() a acceder
	


	@Override
	public Boolean esDestacada() {
		return super.esDestacada() || tecnicasConocidas > 5;
	}
	
	
	public void entrenar(Integer cantDias) {
		masaMuscular = masaMuscular + cantDias / 5;
	} //void pq no devuelve nada; ejecuta una accion
	
	
	public void aprenderTecnica() {
		tecnicasConocidas = tecnicasConocidas + 1;
	}
	
	
	public Integer getMasaMuscular() {
		return masaMuscular;
	}


	public Integer getTecnicasConocidas() {
		return tecnicasConocidas;
	}
	
	@Override
    public void ofrecerTributo(Planeta planeta) {
        planeta.construirMuralla(2);
    }
	
}
