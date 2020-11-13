module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires jid3lib;

    exports org.example.mp3player.main to javafx.graphics;
    opens org.example.mp3player.controller to javafx.fxml;
    opens org.example.mp3player.mp3 to javafx.base;
}