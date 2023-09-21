/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author duke
 */
public class Client extends Person {
    
    private String address;
    private String zipCode;

    public Client(int id, String name, char gender, String dateOfBirth, String phoneNumber, String email, String rg, String address, String zipCode) {
        super(id, name, gender, dateOfBirth, phoneNumber, email, rg);
        this.address = address;
        this.zipCode = zipCode;
    }

    public Client(int id, String name, String address, String zipCode) {
        super(id, name);
        this.address = address;
        this.zipCode = zipCode;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    
}

