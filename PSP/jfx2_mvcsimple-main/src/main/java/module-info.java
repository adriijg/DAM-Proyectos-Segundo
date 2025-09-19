module es.etg.prog.mvc {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.etg.prog.mvc to javafx.fxml;
    opens es.etg.prog.mvc.view to javafx.fxml;
    exports es.etg.prog.mvc.controller;
    exports es.etg.prog.mvc.view;
}
