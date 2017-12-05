import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Controller extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        CheckBox cboxRed = new CheckBox("Red");
        GridPane.setConstraints(cboxRed, 0, 1);

        CheckBox cboxGreen = new CheckBox("Green");
        GridPane.setConstraints(cboxGreen, 0, 2);

        CheckBox cboxBlue = new CheckBox("Blue");
        GridPane.setConstraints(cboxBlue, 0, 3);

        Button btnSelect = new Button("Select");
        GridPane.setConstraints(btnSelect, 0, 4);
        btnSelect.setOnAction(e -> handleCheckBoxOptions(cboxRed, cboxGreen, cboxBlue));

        ChoiceBox<String> choiceBox = new ChoiceBox<String>();
        choiceBox.getItems().addAll("Red", "Green", "Blue");
        choiceBox.setValue("Green");
        GridPane.setConstraints(choiceBox, 0, 5);

        Button btnChoice = new Button("Get Choice");
        GridPane.setConstraints(btnChoice, 0, 6);
        btnChoice.setOnAction(e -> handleChoiceBoxOptions(choiceBox));

        grid.getChildren().addAll(cboxRed, cboxBlue, cboxGreen, btnSelect, choiceBox, btnChoice);
        primaryStage.setScene(new Scene(grid, 300, 300));
        primaryStage.show();
    }

    private void handleCheckBoxOptions(CheckBox cb1, CheckBox cb2, CheckBox cb3) {
        String s = "Checkboxes selected are: ";

        if(cb1.isSelected()) {
            s+= "Red ";
        }

        if(cb2.isSelected()) {
            s+= "Green ";
        }

        if(cb3.isSelected()) {
            s+= "Blue ";
        }

        System.out.println(s);
    }

    private void handleChoiceBoxOptions(ChoiceBox<String> choiceBox) {
        System.out.println("Choice: " + choiceBox.getValue());
    }
}