package escenarioBasico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import Personas.Atleta;
import Personas.Docente;
import Personas.Persona;
import Planetas.Planeta;



public class EscenarioBasico {
	Persona julieta = new Persona(42);
	Persona ana = new Atleta(25); //Atleta
	Persona rosa = new Atleta(45, 8); //Atleta
	Atleta perla = new Atleta(28, 6, 4); //no me deja entrenar si es tipo Persona
	Persona monica = new Docente(45, 6); //Docente
	Persona luisa = new Docente(35, 1); //Docente
	
	Planeta triton = new Planeta(Arrays.asList(julieta, ana, rosa, perla, monica, luisa), 0, 0);
	
	@Test
	void testDeJulieta() {
		assertEquals(20, julieta.potencia());
		assertEquals(8, julieta.inteligencia());
		assertFalse(julieta.esDestacada());
	}
	
	@Test
	void testDeAna() {
		assertEquals(28, ana.potencia());
		assertEquals(12, ana.inteligencia());
		assertTrue(ana.esDestacada());
	}
	
	@Test
	void testDeRosa() {
		assertEquals(52, rosa.potencia());
		assertEquals(8, rosa.inteligencia());
		assertTrue(rosa.esDestacada());
	}
	
	@Test
	void testDePerla() {
		assertEquals(44, perla.potencia());
		assertEquals(12, perla.inteligencia());
		assertFalse(perla.esDestacada());
	}
	
	@Test
	void testDeMonica() {
		assertEquals(20, monica.potencia());
		assertEquals(20, monica.inteligencia());
		assertTrue(monica.esDestacada());
	}
	
	@Test
	void testDeLuisa() {
		assertEquals(20, luisa.potencia());
		assertEquals(14, luisa.inteligencia());
		assertFalse(luisa.esDestacada());
	}
	
	@Test
	void testDePlaneta() {
		assertTrue(triton.getHabitantes().contains(ana));
		assertTrue(triton.getHabitantes().contains(rosa));
		assertTrue(triton.getHabitantes().contains(monica));
		
		assertEquals(2, triton.valorInicialDefensa());
		assertFalse(triton.esCulto());
		assertEquals(184, triton.potenciaReal());
	}
	
	
	@Test
	void testDePerla2() {
		perla.entrenar(15);
		perla.aprenderTecnica();
		
		assertEquals(9, perla.getMasaMuscular());
		assertEquals(65, perla.potencia());
		assertFalse(perla.esDestacada());
	}
	
	@Test
	void testDePerla3() {
		perla.entrenar(15);
		perla.aprenderTecnica();
		perla.aprenderTecnica();
		
		assertEquals(9, perla.getMasaMuscular());
		assertTrue(perla.esDestacada());
	}
	
}
