/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javafx.scene.control.Alert;

public class Shoes extends clothesItem {

    private int size;

    public Shoes(String name, int size, double price) {
        super(name, price);
        this.size = size;
       
    }
@Override
    public void purchase(){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thanks for buying ");
            alert.setHeaderText(null);
            alert.setContentText("you buy a "+name+" price is "+price );
            alert.showAndWait();
}
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("Shoes Details:");
        System.out.println("name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
    }
}
