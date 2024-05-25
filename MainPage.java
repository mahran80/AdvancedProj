/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Administrator
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Advanced Project");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));

        Button signInButton = new Button("Sign In");
        signInButton.setOnAction(e -> {
            SignInGUI signInGUI = new SignInGUI();
            signInGUI.start(new Stage());
        });

        Button signUpButton = new Button("Sign up");
        signUpButton.setOnAction(e -> {
            SignUpGUI signUpGUI = new SignUpGUI();
            signUpGUI.start(new Stage());
        });

        vbox.getChildren().addAll(signInButton, signUpButton);

        Scene scene = new Scene(vbox, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
