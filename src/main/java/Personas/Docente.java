package Personas;

import Planetas.Planeta;

public class Docente extends Persona {
	private Integer cursosDados = 0;
	
	//poner constructor?
	public Docente(Integer edad) {
		super(edad);
	}
	
	public Docente(Integer edad, Integer cursosDados) {
		super(edad);
		this.cursosDados = cursosDados;
	}
	
	
	@Override
	public Integer inteligencia() {
		return super.inteligencia() + cursosDados * 2;
	}
	
	@Override
	public Boolean esDestacada() {
		return cursosDados > 3;
	}
	
	@Override
    public void ofrecerTributo(Planeta planeta) {
        planeta.construirMuseo();
    }
	
	@Override
	public Integer valor() {
        return super.valor() + 5;
    }
}
