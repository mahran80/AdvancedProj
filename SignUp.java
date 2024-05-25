/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.Alert;

public class SignUp {

    public boolean signUp(String username, String password, String email) {

        if (username.isEmpty()) {
            System.out.println("Enter UserName.");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Enter UserName.");
            alert.setHeaderText(null);
            alert.setContentText("Enter UserName.");
            alert.showAndWait();
            return false;
        } else if (password.isEmpty()) {
            System.out.println("Enter Password.");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Enter Password.");
            alert.setHeaderText(null);
            alert.setContentText("Enter Password.");
            alert.showAndWait();
            return false;
        } else if (email.isEmpty()) {
            System.out.println("Enter Email.");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Enter Email.");
            alert.setHeaderText(null);
            alert.setContentText("Enter Email.");
            alert.showAndWait();
            return false;
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
                writer.write(username + "," + password + "," + email);
                writer.newLine();
                writer.flush();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("SigneUp Successfully");
                alert.setHeaderText(null);
                alert.setContentText("SigneUp Successfully");
                alert.showAndWait();
                System.out.println("Create Account Successfully");
                return true;
            } catch (IOException e) {
                System.out.println("Failed While Write The file.");
                e.printStackTrace();
                return false;
            }

        }
    }
}
