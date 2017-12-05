import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BorderLayout");

        // Root node that acts as top node.
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10, 10, 10, 10));

        HBox topBox = new HBox();
        Button btnOne = new Button("Button 1");
        Button btnTwo = new Button("Button 2");
        Button btnThree = new Button("Button 3");
        topBox.getChildren().addAll(btnOne, btnTwo, btnThree);

        VBox leftBox = new VBox();
        Button btnFour = new Button("Button 4");
        Button btnFive = new Button("Button 5");
        Button btnSix = new Button("Button 6");
        leftBox.getChildren().addAll(btnFour, btnFive, btnSix);

        root.setLeft(leftBox);
        root.setTop(topBox);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
