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
public abstract class clothesItem{
 public String material;
  public String name;
  public double price;
  
  public clothesItem(String material, String name, double price) {
    this.material = material;
    this.name = name;
    this.price = price;
  }
  
    public clothesItem(String name, double price) {
    this.name = name;
    this.price = price;
  }


  public String getName() {
    return name;
  }

  public String getMaterial() {
    return material;
  }

  public double getPrice() {
    return price;
  }


  public void setName(String name) {
    this.name = name;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public void setPrice(double price) {
    this.price = price;
  }
    public abstract void displayDetails();
    public abstract void purchase();
}

