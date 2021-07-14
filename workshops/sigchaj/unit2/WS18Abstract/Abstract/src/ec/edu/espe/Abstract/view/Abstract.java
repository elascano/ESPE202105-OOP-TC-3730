/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.view;

import java.util.ArrayList;
import ec.edu.espe.Abstract.model.*;

/**
 *
 * @author Josselyn Sigcha Beta-SoftwareTech ESPE-DCCO
 */
public class Abstract {

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
  
    
    
}
