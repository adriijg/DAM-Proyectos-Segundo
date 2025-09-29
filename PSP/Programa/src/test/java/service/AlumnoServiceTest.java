package service;

import es.etg.prog.mvc.model.Alumno;
import es.etg.prog.mvc.model.Instituto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.List;

public class AlumnoServiceTest {

    @Test
    public void crearAlumnoValido() {
        Instituto mockInstituto = Mockito.mock(Instituto.class);
        AlumnoService service = new AlumnoService(mockInstituto);

        Alumno a = service.crearAlumno("Juan", "Pérez", 20);

        Assertions.assertEquals("Juan", a.getNombre());
        Assertions.assertEquals(20, a.getEdad());
        Mockito.verify(mockInstituto, Mockito.times(1)).matricular(a);
    }

    @Test
    public void crearAlumnoEdadInvalida() {
        Instituto mockInstituto = Mockito.mock(Instituto.class);
        AlumnoService service = new AlumnoService(mockInstituto);

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                service.crearAlumno("Ana", "Gómez", 0)
        );

        Assertions.assertEquals("Edad debe ser mayor que 0", exception.getMessage());
        Mockito.verify(mockInstituto, Mockito.never()).matricular(ArgumentMatchers.any());
    }

    @Test
    public void listarAlumnos() {
        Instituto mockInstituto = Mockito.mock(Instituto.class);
        Mockito.when(mockInstituto.listarAlumnos()).thenReturn(List.of(new Alumno("Juan", "Pérez", 20)));

        AlumnoService service = new AlumnoService(mockInstituto);
        List<Alumno> alumnos = service.listarAlumnos();

        Assertions.assertEquals(1, alumnos.size());
        Assertions.assertEquals("Juan", alumnos.get(0).getNombre());
    }
}
