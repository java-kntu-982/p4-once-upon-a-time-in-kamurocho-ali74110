package ir.ac.kntu.view;

import ir.ac.kntu.Player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;

import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException {
//        Player player = new Player();
//        StackPane root = new StackPane();
//        BorderPane mainRoot = new BorderPane();
//        Scene scene = new Scene(root,1280,720);
//        stage.setScene(scene);
//        root.getChildren().add(mainRoot);
//
////        if(welcome(mainRoot,player).get()){
//
////        mainMenu();
//            FlowPane informationBar = new FlowPane();
//
//            informationBar.setAlignment(Pos.CENTER);
//            informationBar.setPadding(new Insets(10));
//            informationBar.setVgap(20);
//            informationBar.setHgap(20);
//
//            Text name = new Text(player.getName());
//            name.setTextAlignment(TextAlignment.CENTER);
//            Text cash = new Text("cash: "+player.getCash());
//            cash.setTextAlignment(TextAlignment.CENTER);
//            informationBar.getChildren().addAll(name,cash);
//
//            Tab missionsTab = new Tab("Missions");
//            missionsTab.setId("1");
//            missionsTab.setClosable(false);
//            Tab organizationTab = new Tab("Organization");
//            organizationTab.setId("2");
//            organizationTab.setClosable(false);
//            Tab trainTab = new Tab("Train");
//            trainTab.setId("3");
//            trainTab.setClosable(false);
//            Tab HQTab = new Tab("HQs");
//            HQTab.setId("4");
//            HQTab.setClosable(false);
//            Tab recruitEmployeeTab = new Tab("Recruit Employee");
//            recruitEmployeeTab.setId("5");
//            recruitEmployeeTab.setClosable(false);
//            Tab helpTab = new Tab("Help");
//            helpTab.setId("6");
//            helpTab.setClosable(false);
//            TabPane mainMenuPane = new TabPane(missionsTab,organizationTab,trainTab,HQTab,recruitEmployeeTab,helpTab);
//
//            mainRoot.setTop(informationBar);
//            mainRoot.setCenter(mainMenuPane);
////        }
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(new URL(this.getClass().getClassLoader().getResource("loginFXML.fxml")));
        URL fxmlUrl = this.getClass().getClassLoader()
                .getResource("F:\\ALI\\university\\Java\\project 4\\pr4\\p4-once-upon-a-time-in-kamurocho-ali74110\\src\\main\\java\\ir\\ac\\kntu\\view\\loginFXML.fxml");
        AnchorPane anchorPane = FXMLLoader.<AnchorPane> load(fxmlUrl);
        //        VBox vbox = loader.<VBox>load();
//        Parent root = FXMLLoader.load(getClass().getResource());

        Scene scene = new Scene(anchorPane);

        stage.setScene(scene);
        stage.show();
    }
    void mainMenu(){

    }
//    AtomicBoolean welcome(BorderPane mainRoot , Player player){
//        AtomicBoolean finished = new AtomicBoolean(false);
//        VBox welcomeVBox = new VBox();
//        Text welcomeText = new Text("welcome to\n<< Once upon a time in kamurocho >>\nEnter your name:");
//        welcomeText.setOnMouseEntered(e ->{
//            welcomeText.setFill(Color.GREEN);
//        });
//        welcomeText.setOnMouseExited(e ->{
//            welcomeText.setFill(Color.BLACK);
//        });
//        welcomeText.setTextAlignment(TextAlignment.CENTER);
//        welcomeText.setFont(Font.font(25));
//        TextField nameTextField = new TextField("name");
//        nameTextField.setMaxWidth(250);
//        nameTextField.setPrefWidth(200);
//        nameTextField.setAlignment(Pos.CENTER);
//        Button welcomeButton = new Button("submit");
//        welcomeButton.setAlignment(Pos.CENTER);
//        welcomeVBox.setSpacing(20);
//        welcomeVBox.setAlignment(Pos.CENTER);
//        welcomeVBox.getChildren().addAll(welcomeText,nameTextField,welcomeButton);
//        mainRoot.setCenter(welcomeVBox);
//        welcomeButton.setOnMouseClicked(e->{
//            if (!nameTextField.getText().equals("")||!nameTextField.getText().equals(" ")){
//                player.setName(nameTextField.getText());
//                mainRoot.getChildren().remove(welcomeVBox);
//                finished.set(true);
//            }
//        });
//        return finished;
//    }
}