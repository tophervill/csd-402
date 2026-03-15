/*
 *      Christopher Villarreal
 *      Module 11 Assignment 2
 *
 *      Purpose of this Program:
 *      This is a Java program utilizing the JavaFX GUI Framework and displays
 *      the examples of using HBox and VBox layout panes. This program shows
 *      an example of when the use of HBox and VBox can be used in an application.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFxExample extends Application{

    @Override
    public void start(Stage primaryStage) {

        // Title label
        Label titleLabel = new Label("Student Grade Manager");

        // Student ID label and text field
        Label studentIdLabel = new Label("Student ID:");
        TextField studentIdField = new TextField();
        studentIdField.setPromptText("Enter student ID");

        // Grade label and text field
        Label gradeLabel = new Label("Grade:");
        TextField gradeField = new TextField();
        gradeField.setPromptText("Enter grade");

        // Buttons
        Button addButton = new Button("Add Grade");
        Button updateButton = new Button("Update Grade");
        Button deleteButton = new Button("Delete Grade");

        // HBox for Student ID row
        HBox studentIdBox = new HBox(10);

        studentIdBox.setAlignment(Pos.CENTER);
        studentIdBox.getChildren().addAll(studentIdLabel, studentIdField);

        // HBox for Grade row
        HBox gradeBox = new HBox(10);

        gradeBox.setAlignment(Pos.CENTER);
        gradeBox.getChildren().addAll(gradeLabel, gradeField);

        // HBox for button row
        HBox buttonBox = new HBox(15);

        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(addButton, updateButton, deleteButton);

        // VBox for overall layout
        VBox mainLayout = new VBox(20);

        mainLayout.setPadding(new Insets(20));
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.getChildren().addAll(titleLabel, studentIdBox, gradeBox, buttonBox);

        // Scene
        Scene scene = new Scene(mainLayout, 450, 250);

        // Stage settings
        primaryStage.setTitle("JavaFX HBox and VBox Example");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
