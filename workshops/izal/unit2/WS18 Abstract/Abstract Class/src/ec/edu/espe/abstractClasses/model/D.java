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
/*MEMBERS: Luis Heredia, Lilian Iza, Jean Carlos Jarramillo*/
public class D extends B{

    private int x;
    private int y;
        

    public static boolean m(int i){
        
        
        return false;
        
    }

    public D(float f, double d, ArrayList<G> gs) {
        super(f, d, gs);
    }
    
     @Override
    public void operation1(int n) { 
        System.out.println(n);      
    }

    @Override
    public void operation2(float f) {
        System.out.println(f);
    }
}
