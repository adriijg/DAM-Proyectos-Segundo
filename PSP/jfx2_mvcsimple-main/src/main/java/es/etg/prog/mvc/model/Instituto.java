package es.etg.prog.mvc.model;

import java.util.List;

public interface Instituto {
    
    public void matricular(Alumno a);
    public void desmatricular(Alumno a);

    public List<Alumno> listarAlumnos();
}
