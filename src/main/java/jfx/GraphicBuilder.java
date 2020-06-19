package jfx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import ir.ac.kntu.model.game.Game;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.awt.event.MouseEvent;

public abstract class GraphicBuilder {
//    static VBox missionsDetails;
//    static VBox mission1Details;
//    static VBox mission2Details;
//    static VBox mission3Details;
//    static BorderPane missionsBorderPane;
    public static Text creatYourNameText(){
        Text text = new Text("Enter your name:");
        text.setTextAlignment(TextAlignment.CENTER);
        text.setLayoutX(220);
        text.setLayoutY(165);
        text.setFont(Font.font("Matura MT Script Capitals",25));
        return text;
    }
    public static JFXTextField createNameTextField(){
        JFXTextField name = new JFXTextField();
        name.setText("Guest");
        name.setAlignment(Pos.CENTER);
        name.setFocusColor(Color.RED);
        name.setUnFocusColor(Color.valueOf("#ff6d00"));
        name.setLayoutX(190);
        name.setLayoutY(200);
        name.setPrefSize(230,45);
        name.setFont(Font.font("IranSans",20));
        return name;
    }
    public static JFXButton createOKButton(){
        JFXButton okButton = new JFXButton("OK");
        okButton.setButtonType(JFXButton.ButtonType.RAISED);
        okButton.setLayoutX(280);
        okButton.setLayoutY(280);
        okButton.setPrefSize(60,45);
        okButton.setTextFill(Color.RED);
        return okButton;
    }
    public static Text createWelcomeText(){
        Text welcome = new Text("Welcome");
        welcome.setTextAlignment(TextAlignment.CENTER);
        welcome.setFont(Font.font("Matura MT Script Capitals",45));
        welcome.setLayoutX(200);
        welcome.setLayoutY(90);
        welcome.setWrappingWidth(220);
        welcome.setFill(Color.RED);
        return welcome;
    }
    public static ImageView createSATLogo(){
        ImageView satcoder = new ImageView(new Image("Images/satcoder.png"));
        satcoder.setFitHeight(75);
        satcoder.setFitWidth(150);
        satcoder.setLayoutX(0);
        satcoder.setLayoutY(275);
        satcoder.setPickOnBounds(true);
        satcoder.setPreserveRatio(true);
        return satcoder;
    }
    public static Text createNameText(){
        Text name = new Text();
        name.setFont(Font.font("Matura MT Script Capitals",25));
        name.setFill(Color.CHOCOLATE);
        name.setTextAlignment(TextAlignment.CENTER);
        return name;
    }

    public static Text createCashText(){
        Text cash = new Text();
        cash.setFont(Font.font("Matura MT Script Capitals",25));
        cash.setFill(Color.DARKGREEN);
        cash.setTextAlignment(TextAlignment.CENTER);
        return cash;
    }
    public static Tab buildGameTab(){
        Tab tab = new Tab("Game");
        tab.setClosable(false);
        AnchorPane gameTab = new AnchorPane();
        gameTab.setPrefSize(1280,620);
        ImageView cover = new ImageView(new Image("Images/game cover.jpg"));
        gameTab.getChildren().addAll(cover);
        tab.setContent(gameTab);
        return tab;
    }
    public static Tab buildMissionsTab(Game game){
        Tab tab = new Tab("Missions");
        tab.setClosable(false);
        AnchorPane missions = new AnchorPane();
        tab.setContent(missions);
        missions.setPrefSize(1275,595);

        BorderPane missionsBorderPane = new BorderPane();
        missionsBorderPane.setPrefSize(1275,595);
        missionsBorderPane.setPadding(new Insets(10));

        HBox mission1 = createMissionHBox(1,"717700",game);
        HBox mission2 = createMissionHBox(2,"c56f00",game);
        HBox mission3 = createMissionHBox(3,"970101",game);

        VBox missionsView = new VBox();
        missionsView.getChildren().addAll(mission1,mission2,mission3);


        VBox mission1Details;

        game.mission1.information = createMission1Details(180,"Boss lvl.1","6","7","8");
        game.mission2.information = createMission1Details(280,"Boss lvl.2","7","8","9");
        game.mission3.information = createMission1Details(400,"2xBoss lvl.1\n2xBoss lvl.2","8","8","9");
        game.mission1.missionView = mission1;
        game.mission2.missionView = mission2;
        game.mission3.missionView = mission3;
        game.missionsBorderPane = missionsBorderPane;

        missionsBorderPane.setCenter(missionsView);


        missions.getChildren().add(missionsBorderPane);
        return tab;
    }

    private static VBox createMission1Details(int enemiesNum , String bossName , String wavesNum,String hq1,String hq2) {
        VBox vBox = new VBox();

        BorderPane borderPane = new BorderPane();
        Text enemies = new Text(enemiesNum + " enemies");
        enemies.setFont(Font.font("Times New Roman",35));
        enemies.setFill(Color.RED);
        Text boss = new Text(bossName);
        boss.setFont(Font.font("Times New Roman",20));
        boss.setFill(Color.BLACK);
        Text waves = new Text("in "+wavesNum+" Waves");
        waves.setFont(Font.font("Matura MT Script Capitals",30));
        waves.setFill(Color.valueOf("a9a602"));
        borderPane.setPadding(new Insets(5));
        borderPane.setPrefSize(300,200);


        BorderPane borderPane1 = new BorderPane();
        Text HQ = new Text("HQ:");
        ImageView HQ1 = new ImageView(new Image("/Images/Shot000"+hq1+".png"));
        ImageView HQ2 = new ImageView(new Image("/Images/Shot000"+hq2+".png"));
        borderPane1.setPadding(new Insets(5));
        borderPane1.setPrefSize(300,200);

        GridPane gridPane = new GridPane();
        Text winCond = new Text("Win Condition");
        Text defeatCon = new Text("Defeat Condition");
        Text winCondExp = new Text("Defeat All Enemies");
        Text defeatConExp = new Text("All Equipment/Units lost");
        gridPane.setPadding(new Insets(5));
        gridPane.setPrefSize(300,200);

        vBox.getChildren().addAll(borderPane,borderPane1,gridPane);
        return vBox;
    }


    public static Tab buildOrganizationTab(){
        Tab tab = new Tab("Organization");
        tab.setClosable(false);

        return tab;
    }
    public static Tab buildTrainTab(){
        Tab tab = new Tab("Train");
        tab.setClosable(false);

        return tab;
    }
    public static Tab buildFortifyHQTab(){
        Tab tab = new Tab("Fortify HQ");
        tab.setClosable(false);

        return tab;
    }
    public static Tab buildRecruitEmployeeTab(){
        Tab tab = new Tab("Recruit Employee");
        tab.setClosable(false);

        return tab;
    }
    public static Tab buildHelpTab(){
        Tab tab = new Tab("Help");
        tab.setClosable(false);

        return tab;
    }
    public static HBox createMissionHBox(int missionNum , String colour , Game game){
        HBox mission = new HBox();
        mission.setPrefSize(930,120);
        mission.setPadding(new Insets(20));
        mission.setSpacing(50);
        Button startMission = new Button();
        startMission.setAlignment(Pos.CENTER);
        startMission.setText("Start");
        startMission.setPrefSize(150,90);
        startMission.setTextAlignment(TextAlignment.CENTER);
        Text missionText = new Text("Mission "+missionNum);
        missionText.setFont(Font.font("Matura MT Script Capitals",60));
        missionText.setWrappingWidth(330);
        missionText.setFill(Color.valueOf(colour));
        mission.getChildren().addAll(missionText,startMission);
        if (missionNum==1){
            game.mission1.startButton = startMission;
        }else if (missionNum==2){
            game.mission2.startButton = startMission;
        }else if (missionNum==3){
            game.mission3.startButton = startMission;
        }
        return mission;
    }
}
