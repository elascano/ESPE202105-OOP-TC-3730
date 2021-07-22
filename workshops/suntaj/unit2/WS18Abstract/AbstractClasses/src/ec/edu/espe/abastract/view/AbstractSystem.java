/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abastract.view;

import ec.edu.espe.abastract.model.B;
import ec.edu.espe.abastract.model.D;
import ec.edu.espe.abastract.model.E;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class AbstractSystem {
    
    public static void main(String[] args) {
        
        System.out.println("Abstract Classes");
        System.out.println("Author : Team 11");
        
        B b;
        
        b = new D(12 , 5);
        System.out.println("b in int is -> " + b);
        
        System.out.println("b int is a class of -> " + b);
        
        b = new E(5.6F,1.2F);
        System.out.println("b in float is -> " + b.getClass());
        
        ArrayList<B> bs = new ArrayList<>();
        bs.add(b);
        
        System.out.println("b float is a class of -> " + b.getClass());
    }
    
}

    
    

