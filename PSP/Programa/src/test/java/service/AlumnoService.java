package service;

import es.etg.prog.mvc.model.Alumno;
import es.etg.prog.mvc.model.Instituto;

import java.util.List;

public class AlumnoService {

    private final Instituto instituto;

    public AlumnoService(Instituto instituto) {
        this.instituto = instituto;
    }

    public Alumno crearAlumno(String nombre, String apellidos, int edad) {
        if(nombre == null || nombre.isBlank() || apellidos == null || apellidos.isBlank()) {
            throw new IllegalArgumentException("Nombre y apellidos obligatorios");
        }
        if(edad <= 0) {
            throw new IllegalArgumentException("Edad debe ser mayor que 0");
        }

        Alumno alumno = new Alumno(nombre, apellidos, edad);
        instituto.matricular(alumno);
        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        return instituto.listarAlumnos();
    }

    public void desmatricularAlumno(Alumno a) {
        instituto.desmatricular(a);
    }
}
