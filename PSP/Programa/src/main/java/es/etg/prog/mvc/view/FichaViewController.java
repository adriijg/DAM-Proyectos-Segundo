package es.etg.prog.mvc.view;

import es.etg.prog.mvc.controller.InstitutoController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;

public class FichaViewController {

    @FXML
    private Button btnCrear;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtEdad;

    //InstitutoController -> Controlador principal de la aplicación (para llamarlo)
    protected InstitutoController institutoController;

    public void setInstitutoController(InstitutoController controller){
        this.institutoController = controller;
    }

    @FXML
    void crear(ActionEvent event) {
        final String MSG_TITLE =  "Error en el formulario";
        final String MSG_CONTENT = "Todos los campos son obligatorios y la edad debe de ser un número entero";

        if(camposRellenos()){
            institutoController.crearAlumno(txtNombre.getText(), txtApellidos.getText(), Integer.parseInt(txtEdad.getText()));
            txtNombre.setText("");
            txtApellidos.setText("");
            txtEdad.setText("");
        }else{
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setTitle(MSG_TITLE);
            alerta.setContentText(MSG_CONTENT);
            alerta.show();
        }

    }

    @FXML
    void listar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("listaAlumnosView.fxml"));
            Parent root = loader.load();

            ListaAlumnosController listaController = loader.getController();

            listaController.cargarAlumnos(institutoController.listaAlumnos());

            Stage stage = new Stage();
            stage.setTitle("Alumnos matriculado");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private boolean camposRellenos(){
        return campoRelleno(this.txtApellidos) && campoRelleno(this.txtNombre) && campoRelleno(this.txtEdad);
    }

    private boolean campoRelleno(TextField campo){
        boolean relleno = false;
        if(campo!=null && !"".equals(campo.getText().trim())){
            relleno = true;
        }
        return relleno;
    }

}
