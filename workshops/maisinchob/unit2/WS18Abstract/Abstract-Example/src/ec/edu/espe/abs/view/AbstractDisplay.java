/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abs.view;


import ec.edu.espe.abs.model.B;
import ec.edu.espe.abs.model.D;
import ec.edu.espe.abs.model.E;
import java.util.ArrayList;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class AbstractDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("TEAM 8"); 
       System.out.println("Abstract Example in class");
       
        B b;
        
        b = new D(8, 32);
        System.out.println("b in int is -> " + b);
        
        System.out.println("b int is a class of -> " + b);
        
        b = new E(2.2F, 0.8F);
        System.out.println("b in float is -> " + b.getClass());
        
        ArrayList<B> bs = new ArrayList<>();
        bs.add(b);
        
        System.out.println("b float is a class of -> " + b.getClass());
    }
}
