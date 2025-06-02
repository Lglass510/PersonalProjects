module com.mav.rpgbuilder{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.mav.rpgbuilder to javafx.fxml;
    exports com.mav.rpgbuilder.GUI;
}