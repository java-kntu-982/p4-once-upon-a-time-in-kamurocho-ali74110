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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public abstract class GraphicBuilder {
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
        missions.setPrefSize(1275,595);

        BorderPane missionsBorderPane = new BorderPane();
        missionsBorderPane.setPrefSize(1275,595);

        VBox missionsView = new VBox();
        BorderPane mission1 = new BorderPane();
        mission1.setPrefSize(930,120);
        mission1.setPadding(new Insets(5));
        Button startMission1 = new Button();
        startMission1.setAlignment(Pos.CENTER_RIGHT);
        startMission1.setText("Start");
        startMission1.setPrefSize(150,90);
//        game.mission1.wavesNumText;


        BorderPane mission2 = new BorderPane();
        mission2.setPrefSize(930,120);
        mission2.setPadding(new Insets(5));
        Button startMission2 = new Button();
        startMission2.setAlignment(Pos.CENTER_RIGHT);
        startMission2.setText("Start");
        startMission2.setPrefSize(150,90);

        BorderPane mission3 = new BorderPane();
        mission3.setPrefSize(930,120);
        mission3.setPadding(new Insets(5));
        Button startMission3 = new Button();
        startMission3.setAlignment(Pos.CENTER_RIGHT);
        startMission3.setText("Start");
        startMission3.setFont(Font.font("Matura MT Script Capitals",25));
        startMission3.setPrefSize(150,90);


        VBox missionsDetails = new VBox();


        return tab;
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
}
