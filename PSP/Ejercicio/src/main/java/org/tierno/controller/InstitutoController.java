package org.tierno.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.tierno.model.Acceso;
import org.tierno.model.Instituto;
import org.tierno.model.Alumno;

import java.io.IOException;
import java.util.List;

public class InstitutoController extends Application {

    private final static String VIEW_MAIN = "view/fichaView.fxml";
    private static Instituto model;

    @Override
    public void start(Stage stage) throws IOException {
        model = InstitutoFactory.obtemer(Acceso.MOCK);

        stage.setScene(cargarVista(VIEW_MAIN));
        stage.show();
    }

    private Scene cargarVista(String view) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(view));
        Parent root = (Parent)loader.load();

        FichaViewController viewController = fxmlLoader.<FichaViewController>getController();
        viewController.setInstitutoController(this);
        Scene scene = new Scene(root);

        return scene;
    }

    public Alumno crearAlumno(String nombre, String apellidos, int edad) {
        Alumno alumno = new Alumno(nombre, apellidos, edad);
        model.matricular(alumno);

        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        return model.listarAlumnos();
    }
}
