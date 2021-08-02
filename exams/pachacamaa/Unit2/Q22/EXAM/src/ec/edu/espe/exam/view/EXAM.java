/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.view;

import ec.edu.espe.exam.model.B;
import ec.edu.espe.exam.model.E;
import ec.edu.espe.exam.model.D;
import java.util.ArrayList;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCCO
 */
public class EXAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Abstract GROUP 5");
        
        B b;
        
        b = new D(10, 5);
        System.out.println("b in int is -> " + b);
        System.out.println("b int is a class of -> " + b);
        
        b = new E(5.5F, 0.4F);
        System.out.println("b in Float is -> " + b.getClass());       
        ArrayList<B> bs = new ArrayList<>();
        bs.add(b);        
        System.out.println("b Float is a class of -> " + b.getClass());
    }

    public EXAM() {
    }
  
    
    
}
