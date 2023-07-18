package es.cic.ejerc003;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AgendaTest {
		
	private Alumno alumno;
	private Alumno alumno2;
	private Agenda agenda;
	
	@BeforeEach
	void setUp() throws Exception{
		alumno = new Alumno(1,"Diego","Herrero");
		alumno2 = new Alumno(3,"Adrian","Icera");
		agenda = new Agenda();
		agenda.lista.add(alumno);
	}
	
	@Test
	void insertTest() {
		Alumno alum = new Alumno(2,"Bran","Herreria");
		agenda.insertAlumno(alum);
		assertTrue(agenda.lista.contains(alum));
	}
	
	@Test
	void updateTest() {
		agenda.updateAlumno(alumno, alumno2);
		assertTrue(agenda.lista.contains(alumno2));
	}
	
	@Test
	void deleteTest() {
		agenda.deleteAlumno(alumno);
		assertFalse(agenda.lista.contains(alumno));
	}

}
