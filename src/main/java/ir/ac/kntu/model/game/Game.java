package ir.ac.kntu.model.game;

import ir.ac.kntu.model.soldiers.KamurochoSoldier;
import ir.ac.kntu.model.soldiers.Soldier;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Game {

    public BorderPane missionsBorderPane;

//    public mission
    public Player player = new Player() ;
    public Mission mission1 = new Mission(1,6);
    public Mission mission2 = new Mission(2,7);
    public Mission mission3 = new Mission(3,8);
    private List<KamurochoSoldier> mySoldiers = new ArrayList<>();
    private List<KamurochoSoldier> myLockedSoldiers = new ArrayList<>();

    public static void startGame(Scene currentScene, Player player) throws IOException {

    }


    public void mission2Selected(MouseEvent mouseEvent) {
        if (player.getMission2Lock()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("mission 2");
            alert.setHeaderText("mission 2 is locked");
            alert.show();
        }
    }
    public void mission3Selected(MouseEvent mouseEvent) {
        if (player.getMission3Lock()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("mission 3");
            alert.setHeaderText("mission 3 is locked");
            alert.show();
        }
    }

//    public void showMission1(MouseEvent mouseEvent) {
//        enemies.setText("331 enemies");
//        waves.setText("6 waves");
//        boss.setText("1 Boss");
//        HQ1.setImage(new Image("/Images/Shot0006.png"));
//        HQ2.setImage(new Image("/Images/Shot0007.png"));
//    }
//    public void showMission2(MouseEvent mouseEvent) {
//        enemies.setText("470 enemies");
//        waves.setText("7 waves");
//        boss.setText("1 Boss");
//        HQ1.setImage(new Image("/Images/Shot0007.png"));
//        HQ2.setImage(new Image("/Images/Shot0008.png"));
//    }
//    public void showMission3(MouseEvent mouseEvent) {
//        enemies.setText("803 enemies");
//        waves.setText("8 waves");
//        boss.setText("4 Bosses");
//        HQ1.setImage(new Image("/Images/Shot0008.png"));
//        HQ2.setImage(new Image("/Images/Shot0009.png"));
//    }
}
