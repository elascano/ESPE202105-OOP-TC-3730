/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

import java.util.ArrayList;

/**
 *
 * @author Kevin Criollo Beta-SoftwareTech ESPE-DCCO
 */
public abstract class B { //does not have refactor constructors ,getters ,to  strings
    private float f;
    private double d;
    ArrayList<G> gs = new ArrayList<>();

    
    public abstract int operation1(int n);
    
    public abstract float operation2(float f);

    
}
