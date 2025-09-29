package es.etg.prog.mvc.controller;

import java.io.IOException;
import java.util.List;

import es.etg.prog.mvc.App;
import es.etg.prog.mvc.model.Acceso;
import es.etg.prog.mvc.model.Alumno;
import es.etg.prog.mvc.model.Instituto;
import es.etg.prog.mvc.model.InstitutoFactory;
import es.etg.prog.mvc.view.FichaViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InstitutoController extends Application{

    private final static String VIEW_MAIN = "view/fichaView.fxml";

    private static Instituto model;

    @Override
    public void start(Stage stage) throws IOException {

        model = InstitutoFactory.obtener(Acceso.MOCK);

        stage.setScene(cargarVista(VIEW_MAIN));
        stage.show();
    }

    private Scene cargarVista(String ficheroView) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(ficheroView));
        Parent root = (Parent)fxmlLoader.load();  

        FichaViewController viewController = fxmlLoader.<FichaViewController>getController();
        viewController.setInstitutoController(this);
        Scene scene = new Scene(root); 
        
        return scene;
    }



    public Alumno crearAlumno(String nombre, String apellidos, int edad){

        Alumno al = new Alumno(nombre, apellidos, edad);
        model.matricular(al);

        return al;
    }

    public List<Alumno> listaAlumnos(){
        return model.listarAlumnos();
    }
    
}
