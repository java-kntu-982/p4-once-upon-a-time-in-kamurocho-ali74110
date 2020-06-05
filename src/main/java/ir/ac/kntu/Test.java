package ir.ac.kntu;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test extends Application {
//    public static void main(String[] args) {
////        Stage stage1 = new Stage() , stage2 = new Stage();
//
//    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 600, false, SceneAntialiasing.BALANCED);
        stage.setScene(scene);
        root.getChildren().add(new Rectangle(5,20));
        stage.show();
    }
}
