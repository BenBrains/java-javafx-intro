module com.fyxren.graafschap.fxtest {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.fyxren.graafschap.fxtest to javafx.fxml;
    exports com.fyxren.graafschap.fxtest;
}