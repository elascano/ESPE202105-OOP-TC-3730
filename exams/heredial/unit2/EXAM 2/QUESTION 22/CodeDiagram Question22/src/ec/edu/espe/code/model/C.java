/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.code.model;

import java.util.ArrayList;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class C extends A{
    
    
     private ArrayList<E> es = new ArrayList<>(3);

    public C(ArrayList<E> es) {
        
    }

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
    }
    
    

    public ArrayList<E> getEs() {
        return es;
    }

    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
     
    
    
     

  
    
    
    
}
