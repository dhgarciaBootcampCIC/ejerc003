package es.cic.ejerc003;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	List<Alumno> lista = new ArrayList<Alumno>();
	
	void insertAlumno(Alumno alumno) {
		lista.add(alumno);
	}
	
	void deleteAlumno(Alumno alumno) {
		lista.remove(alumno);
//		int id = lista.indexOf(alumno);
//		lista.remove(id);
	}
	
	void updateAlumno(Alumno alumnoOld, Alumno alumnoNew) {
		int id = lista.indexOf(alumnoOld);
		
		lista.set(id , alumnoNew);
	}
	
}
