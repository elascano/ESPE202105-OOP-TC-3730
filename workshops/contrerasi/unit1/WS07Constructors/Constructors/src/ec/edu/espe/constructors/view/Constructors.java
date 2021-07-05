/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructors.view;

import ec.edu.espe.constructors.model.Cup;

/**
 *
 * @author Ian Contreras LAMES ESPE-DCCO
 */
public class Constructors {
    public static void main(String[] args) {
        
        System.out.println("Hello from Cup");
        Cup cup = new Cup("red", "straight", "medium");
        System.out.println(cup);
    }
}
