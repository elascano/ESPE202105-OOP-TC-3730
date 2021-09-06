/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contactsbook.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Contact {
    String name;
    Integer number0ffriends;
    float salary;
    String email;

    public Contact(String name, Integer number0ffriends, float salary, String email) {
        this.name = name;
        this.number0ffriends = number0ffriends;
        this.salary = salary;
        this.email = email;
    }
    
}
