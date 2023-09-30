/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.helpers.LoginHelper;
import model.User;
import view.Login;

/**
 *
 * @author duke
 */
public class LoginController {
    
    private final Login loginView;
    private final LoginHelper helper;
    
    public LoginController(Login loginView) {
        this.loginView = loginView;
        this.helper = new LoginHelper(this.loginView);
    }
    
    
    public void logInSystem() {
        
        User user = helper.getModel();
        // TODO Get a User from View
        // TODO Search this User in the Database
        // If the user  from view has the same user and pass of the DB, redirect it for
        // main menu
        // If not, show a massege for user  "Bad Credentials"
        
    }
    
    public void FizTarefa() {
        System.out.println("Busquei aqui");
        
        this.loginView.exibeMensagem("Executei mano");
    }

}
