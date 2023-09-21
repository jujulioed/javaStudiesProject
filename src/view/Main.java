/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Service;
import model.Client;
import model.Scheduling;
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
        
        User usuario = new User(1, "barbeiro", "senha", "3");
        System.out.println(usuario);
        
        Service servico = new Service(1, "barba", 30);
        
        Scheduling agendamento = new Scheduling(1, cliente, servico, 30, "23/09/2023 09:50");
        System.out.println(agendamento.getClient().getName());
    }
}
