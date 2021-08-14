/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.program.model;

import java.util.ArrayList;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class C extends A {  //0.4
    private ArrayList<E> es=new ArrayList<>();   //0.4

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
    }
    

    public C() {
    }
    

    /**
     * @return the es
     */
    public ArrayList<E> getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(ArrayList<E> es) {
        this.es = es;
    }
    
    
    
}
