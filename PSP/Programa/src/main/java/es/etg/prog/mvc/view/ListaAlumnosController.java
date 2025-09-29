package es.etg.prog.mvc.view;

import es.etg.prog.mvc.model.Alumno;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.List;

public class ListaAlumnosController {

    @FXML
    private ListView<String> listaAlumnos;

    public void cargarAlumnos(List<Alumno> alumnos) {
        listaAlumnos.setItems(FXCollections.observableArrayList(
                alumnos.stream()
                        .map(a -> a.getNombre() + " " + a.getApellidos() + ", " + a.getEdad() + " años")
                        .toList()
        ));
    }
}
