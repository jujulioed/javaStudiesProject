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
public class User extends Person {

    protected String password;
    protected String accessLevel;

    public User(int id, String name, String password, String accessLevel) {
        super(id, name);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public User(int id, String name, char gender, String dateOfBirth, String phoneNumber, String email, String rg, String password, String accessLevel) {
        super(id, name, gender, dateOfBirth, phoneNumber, email, rg);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
 
}
