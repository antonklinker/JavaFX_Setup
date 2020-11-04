package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


/*
Step 1:
File --> Project Structure --> Libraries --> Find javafx SDK lib folder in desktop
Step 2:
Run --> Edit Configurations --> copy paste this to VM options
--module-path /Users/antonklinker/Desktop/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml

You're good to go
 */
