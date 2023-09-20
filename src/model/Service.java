/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author duke
 */
public class Service {
    
    private int id;
    private String description;
    private float price;
    
    public Service(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;        
    }
    
    // Setters
    public void setDescription(String description) {
        System.out.println("Description set for: " + description);
        this.description = description;
    }
    
    public void setprice(float price) {
        System.out.println("Price set for: " + Float.toString(price));
        this.price = price;
    }
    
    // Getters 
    public int getId() {
        return this.id;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public float getPrice() {
        return this.price;
    }
}
