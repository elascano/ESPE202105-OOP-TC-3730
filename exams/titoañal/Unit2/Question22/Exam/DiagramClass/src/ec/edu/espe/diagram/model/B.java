/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.diagram.model;

import java.util.ArrayList;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class B extends A{

    public B(ArrayList<A> as) {
        super(as);
    }


    @Override
    public String toString() {
        return "B{" +super.toString()+ '}';
    }
    
}
