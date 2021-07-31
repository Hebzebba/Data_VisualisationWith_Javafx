package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        double width = Screen.getPrimary().getBounds().getWidth();
        double height = Screen.getPrimary().getBounds().getHeight();
        primaryStage.setTitle("Data Visualization");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setScene(new Scene(root, width, height-50));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
