/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.view;

import ec.edu.espe.constructor.model.User;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class Constructor {
    public static void main(String[] args) {
        System.out.println("HELLO FROM USER OBJECT");
    
        User user = new User("Erick", "Yánez", 19);
        System.out.println(user);
    }
}
