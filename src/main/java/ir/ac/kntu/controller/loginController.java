package ir.ac.kntu.controller;

import com.jfoenix.controls.JFXAlert;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import ir.ac.kntu.model.Game;
import ir.ac.kntu.model.Player;
import ir.ac.kntu.view.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

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
