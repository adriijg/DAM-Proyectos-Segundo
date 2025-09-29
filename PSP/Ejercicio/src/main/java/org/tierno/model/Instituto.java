package org.tierno.model;

import org.tierno.es.etg.prog.mvc.model.Alumno;
import java.util.List;

public interface Instituto {
    public void matricular(Alumno a);
    public void desmatricular(Alumno a);

    public List<org.tierno.es.etg.prog.mvc.model.Alumno> listarAlumnos();
}
