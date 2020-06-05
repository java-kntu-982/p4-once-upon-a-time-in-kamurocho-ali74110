package ir.ac.kntu.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class FXMLController {
    public JFXButton loginButton;
    @FXML
    JFXTextField name ;
    @FXML
    TabPane menu ;
    @FXML
    public void handleNameEntered(MouseEvent mouseEvent) throws IOException {
        System.out.println(name.getText());
        name.getScene().setRoot(FXMLLoader.load(getClass().getResource("MenuFXML.fxml")));
    }
}
