/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class SignIn {

    public boolean signIn(String username, String password) {

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("please Enter your Data.");
            return false;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                if (userData[0].equals(username) && userData[1].equals(password)) {
                    System.out.println("Log In Successfully ");
                    ClothesGui clothesGui = new ClothesGui();
                    clothesGui.start(new Stage());
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("LogIn Successfully");
                    alert.setHeaderText(null);
                    alert.setContentText("Welcome  "+username);
                    alert.showAndWait();
                    return true;
                }
            }
            System.out.println("Failed to LogIn  ");
            Platform.runLater(() -> {
                MainPage mainPage = new MainPage();
                try {
                    mainPage.start(new Stage());
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Faild to SignIn");
                    alert.setHeaderText(null);
                    alert.setContentText("The User name or Password Is not True.");
                    alert.showAndWait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            return false;
        } catch (IOException e) {
            System.out.println("Faild to read the file.");
            e.printStackTrace();
            return false;
        }
    }
}
