/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.helpers;

import model.User;
import view.Login;

/**
 *
 * @author duke
 */
public class LoginHelper {
    
    private final Login loginView;

    public LoginHelper(Login view) {
        this.loginView = view;
    }
    
    public User getModel() {
        String name = loginView.getUserField().getText();
        String pass = loginView.getPassField().getText();
        
        User model = new User(0, name, pass, "1");
        return model;
    }
    
    public void setMode(User model) {
        String name = model.getName();
        String pass = model.getPassword();
        
        loginView.getUserField().setText(name);
        loginView.getPassField().setText(pass);
    }
    
    public void cleanField() {
        loginView.getUserField().setText("");
        loginView.getPassField().setText("");
    }
}
