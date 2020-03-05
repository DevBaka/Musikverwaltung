package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Musikverwaltung");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        VBox haupt = new VBox();
        haupt.setSpacing(10);
        haupt.setPadding(new Insets(8,8,8,8));

        HBox top = new HBox();
        top.setSpacing(10);


        Button cmdTest = new Button();
        //cmdTest.setPreferredSize(20);
        cmdTest.setLabel("baka");

        HBox button = new HBox();
        button.setPadding(new Insets(0,0,0,0));
        button.setSpacing(10);


        Panel canvas = new Panel();
        //canvas.setBackground("-fx-background-color: green;");
        canvas.setBackground(Color.getColor("#00FF00"));
        canvas.setSize(20,40);

        

    }


    public static void main(String[] args) {
        launch(args);
    }
}
