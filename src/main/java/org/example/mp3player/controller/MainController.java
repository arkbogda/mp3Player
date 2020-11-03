package org.example.mp3player.controller;

import javafx.fxml.FXML;

public class MainController {

    @FXML
    ContentPaneController contentPaneController;

    @FXML
    ControlPaneController controlPaneController;

    @FXML
    MenuPaneController menuPaneController;

    public void initialize() {
        System.out.println("Main controller created");
        System.out.println(contentPaneController);
        System.out.println(controlPaneController);
        System.out.println(menuPaneController);
    }
}