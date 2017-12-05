import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Controller extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Event Handler");

        // Root node that acts as top node.
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));

        Text message = new Text("Message at the top.");
        GridPane.setConstraints(message, 0, 0);

        Button btnOne = new Button("Button One");
        GridPane.setConstraints(btnOne, 0, 1);

        btnOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Button one click.");
            }
        });

        Button btnTwo = new Button("Button Two");
        GridPane.setConstraints(btnTwo, 0, 2);

        btnTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("Button two click.");
            }
        });

        Button btnThree = new Button("Button Three");
        GridPane.setConstraints(btnThree, 0, 3);

        btnThree.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
               grid.getChildren().remove(message);
            }
        });

        grid.getChildren().addAll(message, btnOne, btnTwo, btnThree);
        primaryStage.setScene(new Scene(grid, 300, 250));
        primaryStage.show();
    }
}
