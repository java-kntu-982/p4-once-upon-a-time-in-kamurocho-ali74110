package jfx;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import ir.ac.kntu.model.Game;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import static jfx.GraphicBuilder.*;

public class Play extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    private static Game game = new Game();

    @Override
    public void start(Stage stage) {
        AnchorPane root = new AnchorPane();
        AnchorPane root2 = new AnchorPane();
        tuneStage(stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);

        startLoginPage(root,root2,stage);

        startMenuPage(root2);
        stage.show();
    }

    public void tuneStage(Stage stage){
        stage.setResizable(false);
        stage.setHeight(400);
        stage.setWidth(600);
    }

    public void startLoginPage(AnchorPane root, AnchorPane root2, Stage stage){
        Text text = creatYourNameText();
        JFXTextField name = createNameTextField();
        JFXButton okButton = createOKButton();
        Text welcome = createWelcomeText();
        ImageView satcoder = createSATLogo();


        new Thread(()->{
            welcome.setOnMouseEntered(e ->{
                welcome.setFill(Color.ORANGE);
            });
            welcome.setOnMouseExited(e ->{
                welcome.setFill(Color.RED);
            });
            okButton.setOnMouseClicked(e ->{
                if (!name.getText().equals("") && !name.getText().equals(" ")){
                    game.player.setName(name.getText());
                    stage.setHeight(720);
                    stage.setWidth(1280);
                    root.getScene().setRoot(root2);
                }
            });
        }).start();

        root.getChildren().addAll(text,name,okButton,welcome,satcoder);
        root.setMaxSize(600,400);
    }
    public void startMenuPage(AnchorPane root){
        root.setPrefSize(1280,720);
        root.setMinSize(1280,720);

        Text name = createNameText();
        name.setText(game.player.getName());

        Text cash = createCashText();
        cash.setText("cash : " +game.player.getCash());

        HBox informationBar = new HBox(200);
        informationBar.setAlignment(Pos.CENTER);
        informationBar.getChildren().addAll(name,cash);

        TabPane menu = new TabPane(buildGameTab(),buildMissionsTab(game),buildOrganizationTab(),buildTrainTab(),buildFortifyHQTab(),buildRecruitEmployeeTab(),buildHelpTab());
        menu.setPrefSize(1280,720);

        GridPane menuGridPane = new GridPane();
        menuGridPane.setVgap(5);
        menuGridPane.setPadding(new Insets(10));
        menuGridPane.setMinSize(1280,720);
        menuGridPane.addRow(0, informationBar);
        menuGridPane.addRow(1, menu);

        root.getChildren().add(menuGridPane);
    }


}
