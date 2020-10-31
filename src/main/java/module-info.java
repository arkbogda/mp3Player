module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports org.example.mp3player.main to javafx.graphics;
    opens org.example.mp3player.main.controller to javafx.fxml;
}