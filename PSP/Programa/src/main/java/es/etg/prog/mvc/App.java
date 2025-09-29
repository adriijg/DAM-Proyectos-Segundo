package es.etg.prog.mvc;

import javafx.application.Application;
import es.etg.prog.mvc.controller.InstitutoController;

public class App {

    public static void main(String[] args) {

        InstitutoController controller = new InstitutoController();

        Application.launch(InstitutoController.class, args);
    }
}