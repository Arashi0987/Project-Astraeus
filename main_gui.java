package astraeus_v1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.ChoiceBox;

public class MainGUI extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    	@Override
    public void start(final Stage primaryStage) {
    		//Setting parameters for the Stage
            primaryStage.setTitle("Astraeus");
            primaryStage.setWidth(850);
            primaryStage.setHeight(700);
            
            
        //Creating Horizontal Box and Vetical Boxes that make up the main scene
            HBox mainLayout = new HBox();
            VBox vLeft = new VBox(30);
            vLeft.setMinWidth(284);
            vLeft.setPadding(new Insets(15, 0, 15, 0));
            VBox vRight = new VBox(30);
            vRight.setMinWidth(284);
            VBox vCenter = new VBox (40);
            vCenter.setMinWidth(282);
            mainLayout.getChildren().addAll(vLeft, vCenter, vRight);
            mainLayout.setStyle("-fx-background-color: #290034");
            
        //Creating the image for use in the GUI
            Image cube = new Image("Resources/Cubesat.png");
            ImageView cubev = new ImageView(cube);
            cubev.setFitWidth(274);
            cubev.setFitHeight(354);
            
        // This is a temporary stand-in for the actual map function
            Image dummyMap = new Image("Resources/dummymap.png");
            ImageView map = new ImageView(dummyMap);
            map.setFitWidth(274);
            map.setFitHeight(285);
            vLeft.getChildren().addAll(cubev, map);
            
       
            
        //Creating the main label for the GUI
            BorderPane root = new BorderPane();
            Label astraeus = new Label("Astraeus \n\n\n\n\n\n");
            astraeus.setStyle("-fx-text-fill: #EAF11A; -fx-font: 30 century-gothic; -fx-font-weight: bold");
            astraeus.setPadding(new Insets(0, 0, 10, 0));
            root.setMaxWidth(Double.MAX_VALUE);
            root.setCenter(astraeus);
            
        //Creating Buttons for main GUI
            Button command = new Button("Control Cubesat/ View Commands");
            command.setMaxWidth(Double.MAX_VALUE);
            command.setMinHeight(50);
            Button rtData = new Button("View Real-Time Data");
            rtData.setMaxWidth(Double.MAX_VALUE);
            rtData.setMinHeight(50);
            Button rData = new Button("View Recorded Data");
            rData.setMaxWidth(Double.MAX_VALUE);
            rData.setMinHeight(50);
            Button help = new Button("Control Cubesat/ View Commands");
            help.setMaxWidth(Double.MAX_VALUE);
            help.setMinHeight(50);
            vCenter.getChildren().addAll(root, command, rtData, rData, help);
            
      
      //Making and displaying the scene
            Scene mainScene = new Scene(mainLayout);
            primaryStage.setScene(mainScene);
            primaryStage.show();
    	}
}
