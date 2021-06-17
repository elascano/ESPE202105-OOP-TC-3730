/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.investigator.view;

import ec.edu.investigator.model.Person;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Constructor {
    public static void main(String[] args) {
        
       System.out.println("Hello From Person Object");
       Person person= new Person("Stefany", 19, "Student ");
       System.out.println(person);
        
    }
    
}
