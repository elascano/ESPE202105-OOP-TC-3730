/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstractClasses.model;


import java.util.ArrayList;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class D extends B{ //1

    private int x;  //1

    private int y;  //1

        

    public static boolean m(int i){  //0 // Incomplete operation

        
        
        return false;
        
    }

    public D(float f, double d, ArrayList<G> gs) { //0  // Incomplete operation
        super(f, d, gs);
    }
    
     @Override
    public void operation1(int n) { //0  // Incomplete operation
        System.out.println(n);      
    }

    @Override
    public void operation2(float f) { //0   // Incomplete operation
        System.out.println(f);
    }
}
