module es.etg.prog.mvc {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens es.etg.prog.mvc to javafx.fxml;
    opens es.etg.prog.mvc.view to javafx.fxml;
    exports es.etg.prog.mvc.controller;
    exports es.etg.prog.mvc.view;
    exports es.etg.prog.mvc.model;
}
