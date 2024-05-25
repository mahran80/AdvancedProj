/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ClothesGui extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Clothes GUI");

        
        Button tShirtsButton = new Button("T-Shirts");
        Button pantaloonsButton = new Button("Pantaloons");
        Button shoesButton = new Button("Shoes");

        
        tShirtsButton.setOnAction(e -> {
            TShirtsGui tShirtsGui = new TShirtsGui();
            try {
                tShirtsGui.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(ClothesGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        pantaloonsButton.setOnAction(e -> {
            PantaloonsGui pantaloonsGui = new PantaloonsGui();
            try {
                pantaloonsGui.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(ClothesGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        shoesButton.setOnAction(e -> {
            ShoesGui shoesGui = new ShoesGui();
            try {
                shoesGui.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(ClothesGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(tShirtsButton, pantaloonsButton, shoesButton);

        
        Scene scene = new Scene(vbox, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
