package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application  {

//    Controller controller = new Controller();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("4function.fxml"));
        Image applicationIcon = new Image(getClass().getResourceAsStream("calculatoricon2.png"));
        primaryStage.getIcons().add(applicationIcon);
        primaryStage.setTitle("Java Calculator");
        primaryStage.setScene(new Scene(root, 326, 451));
        primaryStage.show();

        
    }


    public static void main(String[] args) {
        launch(args);


    }
}
