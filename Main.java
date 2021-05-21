package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.layout .*;
import javafx.geometry.*;
import javafx.stage.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("application.fxml"));
        primaryStage.setTitle("The best Calculator");
        primaryStage.setScene(new Scene(root, 515, 650));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
