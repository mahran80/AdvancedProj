/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javafx.scene.control.Alert;

public class Pantaloons extends clothesItem {
    private String size;
    
    public Pantaloons(String material, String name, String size, double price) {
    super(material, name, price);
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
    public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }
public void displayDetails() {
        System.out.println("Pantaloon Details:");
        System.out.println("Material: " + material);
        System.out.println("name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);

    }
}
