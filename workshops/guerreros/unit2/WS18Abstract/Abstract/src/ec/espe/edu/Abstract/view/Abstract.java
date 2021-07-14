/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.Abstract.view;

import ec.espe.edu.Abstract.model.B;
import ec.espe.edu.Abstract.model.D;
import ec.espe.edu.Abstract.model.E;
import java.util.ArrayList;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Abstract {
    public static void main(String[] args) {
    
     
        
        System.out.println("Name: Stefany Guerrero" +"\n Andres Galarza");
        System.out.println("NRC: 3730");
        System.out.println("Welcome Abstract System");
        System.out.println("\n ");
        
      
        
        B b;
        
        b = new D(9, 10);
        System.out.println("b in int is -> " + b);
        
        System.out.println("b int is a class of -> " + b);
        
        b = new E(2.2F, 0.8F);
        System.out.println("b in float is -> " + b.getClass());
        
        ArrayList<B> bs = new ArrayList<>();
        bs.add(b);
        
        System.out.println("b float is a class of -> " + b.getClass());
        
        
        
        
        
    }
    
}
