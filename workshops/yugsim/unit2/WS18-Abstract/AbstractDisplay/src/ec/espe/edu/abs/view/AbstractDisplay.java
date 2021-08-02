/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.abs.view;

import ec.espe.edu.abs.model.*;
import java.util.ArrayList;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCC0
 */
public class AbstractDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Abstract Example in class");
        
        B b;
        
        int x;
        int y;
        float f;
        double d;
        ArrayList<G> gs = new ArrayList<>();
        
        x = 1;
        y = 2;
        f = 1.0F;
        d = 12.98F;
        
        b = new D(x, y, f, d, gs);
        
        System.out.println("b -> " + b + "of type" + b.getClass().getName());
        
        b = new E(f, f, f, d, gs);
        
        System.out.println("b -> " + b + "of type" + b.getClass().getName());
    }
    
}
