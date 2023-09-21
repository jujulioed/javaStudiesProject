/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Service;
import model.Client;
import model.User;

/**
 *
 * @author duke
 */
public class Main {
    
    public static void main(String[] args) {
        
        String nome = "Julio";
        
        Service barba = new Service(1, "barba", 19);
        
        System.out.println(barba.getDescription());
        
        Client cliente = new Client(1, "Julio", "Rua teSte", "13154515");
        
        System.out.println(cliente.getName());
        
        User usuario = new User(1, "barbeiro", "senha", "3");
        System.out.println(usuario);
        
    }
}
