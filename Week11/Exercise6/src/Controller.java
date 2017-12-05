import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Controller extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);

        Label emailLabel = new Label("Email");
        GridPane.setConstraints(emailLabel, 0, 0);

        TextField emailInput = new TextField("example@domain.com");
        GridPane.setConstraints(emailInput, 1, 0);

        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        TextField passInput = new TextField("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginBtn = new Button("Log in");
        GridPane.setConstraints(loginBtn, 1, 2);

        grid.getStylesheets().add("/style.css");
        grid.getChildren().addAll(emailLabel, emailInput, passLabel, passInput, loginBtn);
        primaryStage.setScene(new Scene(grid, 300, 200));
        primaryStage.show();
    }
}