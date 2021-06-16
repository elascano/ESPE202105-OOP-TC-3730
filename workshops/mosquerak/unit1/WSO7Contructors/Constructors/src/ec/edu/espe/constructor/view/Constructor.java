/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.view;

import ec.edu.espe.constructor.model.Laptop;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Constructor {
    
public static void main(String[] args) {
    System.out.println("Constructor - Laptop");
    Laptop laptop = new Laptop("Dell","Latitude",32);
    System.out.println(laptop);
    }
}
