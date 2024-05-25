/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SignUpGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SignUp Page");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 0);
        TextField usernameField = new TextField();
        GridPane.setConstraints(usernameField, 1, 0);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);
        PasswordField passwordField = new PasswordField();
        GridPane.setConstraints(passwordField, 1, 1);

        Label emailLabel = new Label("Email:");
        GridPane.setConstraints(emailLabel, 0, 2);
        TextField emailField = new TextField();
        GridPane.setConstraints(emailField, 1, 2);

        Button signUpButton = new Button("Sign Up");
        GridPane.setConstraints(signUpButton, 1, 3);
        signUpButton.setOnAction(e -> {
            SignUp signUp = new SignUp();
            signUp.signUp(usernameField.getText(), passwordField.getText(), emailField.getText());
            MainPage mainPage = new MainPage();
 try { mainPage.start(new Stage());

 } 
 catch (Exception ex) { ex.printStackTrace(); } 
        });

        grid.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, emailLabel, emailField, signUpButton);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
