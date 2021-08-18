/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.exam.view;

import ec.espe.edu.exam.model.B;
import ec.espe.edu.exam.model.E;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class ExamUnit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
    

