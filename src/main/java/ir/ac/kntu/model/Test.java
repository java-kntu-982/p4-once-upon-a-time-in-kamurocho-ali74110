package ir.ac.kntu.model;

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
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 600, false, SceneAntialiasing.BALANCED);
        stage.setScene(scene);
        root.getChildren().add(new Rectangle(5,20));
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
