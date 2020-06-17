package ir.ac.kntu.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import ir.ac.kntu.model.game.Game;
import ir.ac.kntu.model.game.Player;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class loginController {
    @FXML
    public JFXButton loginButton;
    @FXML
    public AnchorPane loginScene;
    @FXML
    private JFXTextField name;

    public void handleNameEntered(MouseEvent mouseEvent) throws IOException {
        Alert welcome = new Alert(Alert.AlertType.CONFIRMATION);
        welcome.setContentText("once upon a time in kamurocho");
        welcome.setHeaderText("Welcome "+ name.getText());
        welcome.setTitle("Hi");
        welcome.show();
        Scene currentScen = loginScene.getScene();
        Player player = new Player();
        player.setName(name.getText());
        Game.startGame(currentScen,player);
//        loginScene.getScene().
    }
}
