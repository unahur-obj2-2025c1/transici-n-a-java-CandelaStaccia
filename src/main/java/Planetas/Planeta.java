package Planetas;

import java.util.List;

import Personas.Persona;

public class Planeta {
	private List<Persona> habitantes;// = new ArrayList<>();
	private Integer cantMuseos;
	private Integer kmMurallas;
	
	public Planeta(List<Persona> habitantes, Integer cantMuseos, Integer kmMurallas) {
        this.habitantes = habitantes;
        this.cantMuseos = cantMuseos;
        this.kmMurallas = kmMurallas;
    }
	
	public List<Persona> getHabitantes() {
		return habitantes;
	}
	
	public void agregarPersona(Persona persona) {
		habitantes.add(persona);
	}
	
	public void agregarVarias(List<Persona> personas) {
		habitantes.addAll(personas);
	}
	
	public List<Persona> delegacionDiplomatica() {
		return habitantes.stream().filter(h -> h.esDestacada()).toList();
	} //? transforma el resultado en una lista de personas
	
	//return habitantes.stream().filter(h -> h.esDestacado()).toList();
	//devuelve la lista de personas
    //stream() habilita los metodos q modifican listas
    //toList() devuelve como lista
    //toSet() para conjuntos: no repetidos
    //List<tipoDeDato>
	
	public Integer valorInicialDefensa() {
		return (int) this.habitantes.stream().filter(h -> h.potencia() >= 30).count();
	} //cuenta los q cumplen la condicion y lo transforma en un nro chico (int)
	
	//return personas.stream().filter(h -> h.potencia() >= 30).count();
    //filtra y cuenta los q cumplen la condicion
	
	//return habitantes.stream().filter(h -> h.potencia() >= 30).toList.size();
	//filtra, pone como lista y devuelve el tamaño de la lista = cuantos cumplen
	
	public Boolean esCulto() {
		return cantMuseos >= 2 && habitantes.stream().allMatch(h -> h.inteligencia() >= 10);
	}
	
	public Integer potenciaReal() {
		return habitantes.stream().map(h -> h.potencia()).reduce(0,  Integer::sum);
	}//o con mapToInt().sum() ... mapToInt() convierte el stream a un IntStream secuencia de nros enteros
	//return habitantes.stream().mapToInt(h -> h.potencia()).sum();
	//lista con las potencias y las suma
    //mapToInt() hace q los datos sean Integer ?? algo asi. Lista solo de potencia
	
	public void construirMuralla(Integer km) {
        kmMurallas = kmMurallas + km;
    }
	
	public void construirMuseo() {
        cantMuseos = cantMuseos + 1;
    }
	
	public Integer potenciaAparente() {
        return habitantes.stream().mapToInt(h -> h.potencia()).max().orElse(0) * habitantes.size();
    }//busca al mas potente, si no hay habitante, devuelve 0

	/*public Integer potenciaAparente(){
        var habitanteMasPotente = habitantes.stream()
                            .max((h1, h2) -> h1.potencia() - h2.potencia())
                            .get();
        return habitanteMasPotente.potencia() * habitantes.size();
    } */
	
	public Boolean necesitaReforzarse() {
        return potenciaAparente() >= potenciaReal() * 2;
    }//el doble de la real o mas
	
	public void recibirTributos() {
        habitantes.forEach(h -> h.ofrecerTributo(this));
    }
	
	public List<Persona> habitantesValiosos() {
		return habitantes.stream().filter(h -> h.valor() >= 40).toList();
	}
	
	public void apaciguar(Planeta planeta) {
		this.habitantesValiosos().forEach(h -> h.ofrecerTributo(planeta));
	}
}
