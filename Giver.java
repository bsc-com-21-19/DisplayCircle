import  javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Giver extends Application{
    public void start(Stage primaryStage){
           StackPane pane = new StackPane();
           Circle circle = new Circle(40,40,40);
           Button button = new Button("I HATE YOU ");
           button.setOnAction(e -> circle.setFill(javafx.scene.paint.Color.RED));
           Scene  scene = new Scene(pane ,300 ,300);
           pane.getChildren().add(circle);
           Stage stage = new Stage();

       primaryStage.setTitle("Love life");
       primaryStage.setScene(scene);
       primaryStage.show();

    }
}
 class Main{
    public static void main(String[] args){
        Application.launch(args);
    }
}