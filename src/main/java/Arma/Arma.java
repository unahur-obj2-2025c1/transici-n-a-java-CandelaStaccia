package Arma;

import Personas.Soldado;

public interface Arma {
	public Integer potencia(Soldado soldado);
}
//nunca se crea un arma en sí, por eso no es una clase abstracta
//una clase abst por solo 1 metodo --> crear interfaz
//en la interfaz no se puede definir una logica en el metodo
//hay que agregar todos los metodos que aparezcan en la interfaz
//una clase puede "heredar" de mas de una interfaz