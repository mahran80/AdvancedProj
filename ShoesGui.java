/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
class ShoesGui extends Application {

    @Override
    public void start(Stage primaryStage){
                
            TableView table = new TableView();
            table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            table.setPlaceholder(new Label("No rows to display")); //when there is no data within the label
            
            
            
            TableColumn c2 = new TableColumn("Name"); //the value of table id comes from student class id
            c2.setCellValueFactory(new PropertyValueFactory<>("name"));

            TableColumn c3 = new TableColumn("Size");
            c3.setCellValueFactory(new PropertyValueFactory<>("size"));

            TableColumn c4 = new TableColumn("Price");
            c4.setCellValueFactory(new PropertyValueFactory<>("price"));

           table.getColumns().addAll( c2, c3, c4);
            
            ObservableList<Shoes> data = FXCollections.observableArrayList();
            Shoes shoes1 = new Shoes( "White Flat Shoes", 42, 500);
            Shoes shoes2 = new Shoes("White & Green Sneakers", 38, 450);
            Shoes shoes4 = new Shoes("Black & Red Running Shoes", 39, 500);
            Shoes shoes3 = new Shoes("Black Boots", 45, 600);
            Shoes shoes5 = new Shoes("Black Flat Shoes", 40, 450);

            data.addAll(shoes1, shoes2, shoes3, shoes4, shoes5);
Button b2 = new Button("Buy1 ");
             b2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                   shoes1.purchase();
                }
            });
            Button b3 = new Button("Buy2 ");
             b3.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                   shoes2.purchase();
                }
            });
            Button b4 = new Button("Buy3 ");
             b4.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                   shoes3.purchase();
                }
            });
            Button b5 = new Button("Buy4 ");
             b5.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                   shoes4.purchase();
                }
            });
            table.setItems(data);
            
            Label label = new Label("Shoes");
            label.setFont(new Font("Arial", 30));
            
            Button goBack = new Button("Go Back");
            goBack.setPrefSize(100, 50);
            goBack.setOnAction(e -> {
            ClothesGui clothesGui = new ClothesGui();
            clothesGui.start(new Stage());
        });

        table.setPrefWidth(500);
        
        VBox vbox1 = new VBox(table);
        VBox vbox2 = new VBox(label);
        VBox vbox3 = new VBox(vbox2, vbox1);
        vbox1.setAlignment(Pos.CENTER);
        vbox2.setAlignment(Pos.CENTER);
        vbox3.setAlignment(Pos.CENTER);
        vbox1.setPadding(new Insets(30));
//        vbox2.setPadding(new Insets(30));
        vbox3.setPadding(new Insets(30));
        HBox hbox2 = new HBox(b2,b3,b4,b5);
        HBox hbox = new HBox(vbox3, goBack,hbox2);
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.setAlignment(Pos.CENTER);
        

        
        Scene scene = new Scene(hbox, 1000, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

        
    }
        public static void main(String[] args) {
        launch(args);
    }
    
}
