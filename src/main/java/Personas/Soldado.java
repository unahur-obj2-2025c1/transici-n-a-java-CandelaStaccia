package Personas;

import Planetas.Planeta;

import java.util.List;

import Arma.Arma;


public class Soldado extends Persona {
	private List<Arma> armas;
	
	public Soldado(Integer edad) {
        super(edad);
    }
	
	@Override
    public Integer potencia() {
        return super.potencia() + armas.stream().mapToInt(a -> a.potencia(this)).sum();
    }

    @Override
    public void ofrecerTributo(Planeta planeta) {
        planeta.construirMuralla(5);
    }
}
