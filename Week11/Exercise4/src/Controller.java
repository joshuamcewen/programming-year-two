import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Controller extends Application {

    Scene scene1;

    public void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Switching Scenes");

        // Scene 1
        Label label1 = new Label("This is scene 1.");
        Button btnScene1 = new Button("Goto scene 2");
        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(label1, btnScene1);
        this.scene1 = new Scene(layout1, 300, 300);

        primaryStage.setScene(this.scene1);
        primaryStage.show();
    }
}
