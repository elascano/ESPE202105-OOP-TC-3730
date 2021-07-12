/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pkgabstract.view;

import ec.edu.espe.pkgabstract.model.B;
import ec.edu.espe.pkgabstract.model.D;
import ec.edu.espe.pkgabstract.model.E;
import java.util.ArrayList;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
