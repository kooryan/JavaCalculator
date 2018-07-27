package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application  {

//    Controller controller = new Controller();
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        /** System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Calculator"); */

        Parent root = FXMLLoader.load(getClass().getResource("4function.fxml"));

        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("calculatoricon2.png")));
        primaryStage.setTitle("Calculator");

        java.awt.Image dockIcon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("calculatoricon2.png"));
        Taskbar taskbar = Taskbar.getTaskbar();
        taskbar.setIconImage(dockIcon);

        primaryStage.setScene(new Scene(root, 297, 460));
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);

    }
}
