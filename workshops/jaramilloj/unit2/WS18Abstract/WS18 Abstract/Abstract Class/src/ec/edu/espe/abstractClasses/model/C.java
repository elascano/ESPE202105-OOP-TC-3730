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
public class C extends F{
     
   
   private ArrayList<H> hs = new ArrayList<>();
   
   public static void m(F f){ 
   }
   public static float m(float f){
       
       
       return 0;
   
    
       
   }

    public C(ArrayList<H> hs, String r) {
        super(r);
        this.hs = hs;
    }
    @Override
    public String toString() {
        return "C{"+super.toString()  + "hs=" + getHs() + '}';
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }
   
     
    
}
