import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Controller extends Application {

    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Scene 1
        Label label1 = new Label("This is scene 1.");
        Button button1 = new Button("Goto scene 2.");
        button1.setOnAction(e -> primaryStage.setScene(scene2));

        VBox layout1 = new VBox(10);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 300, 300);

        // Scene 2
        Button button2 = new Button("Goto scene 1.");
        button2.setOnAction(e -> primaryStage.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 300, 300);

        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}