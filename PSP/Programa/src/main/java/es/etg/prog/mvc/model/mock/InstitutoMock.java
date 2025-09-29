package es.etg.prog.mvc.model.mock;

import java.util.ArrayList;
import java.util.List;

import es.etg.prog.mvc.model.Alumno;
import es.etg.prog.mvc.model.Instituto;

public class InstitutoMock implements Instituto{

    private List<Alumno> lista = new ArrayList<>();

    @Override
    public void matricular(Alumno a) {
        lista.add(a);
    }

    @Override
    public void desmatricular(Alumno a) {
        lista.remove(a);
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return lista;
    }
    
}
