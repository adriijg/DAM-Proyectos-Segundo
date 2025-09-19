package es.etg.prog.mvc;

import javafx.application.Application;
import es.etg.prog.mvc.controller.InstitutoController;

/**
 * JavaFX App
 */
public class App {

    public static void main(String[] args) {

        //Instancio el controlador
        InstitutoController controller = new InstitutoController();

        //Inicio la aplicación javafx (se ejecutará el método start del controlador InstitutoController.java)
        Application.launch(InstitutoController.class, args);
    }
    // Añadir botón para listar alumnos (aunque no sea visible)
}