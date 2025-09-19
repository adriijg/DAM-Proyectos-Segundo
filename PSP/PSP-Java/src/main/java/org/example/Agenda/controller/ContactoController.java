package org.example.Agenda.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ContactoController {

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtTlf;

    @FXML
    private TextField txtEmail;

    @FXML
    private Button btnOK;

    @FXML
    private Label lblName;

    @FXML
    private Label lblTlf;

    @FXML
    private Label lblEmail;

    @FXML
    private void agregarContacto() {
        String nombre = txtName.getText();
        String telefono = txtTlf.getText();
        String email = txtEmail.getText();

        System.out.printf("Nombre: %s, Teléfono: %s, Email: %s", nombre, telefono, email);

        txtName.clear();
        txtTlf.clear();
        txtEmail.clear();
    }
}
