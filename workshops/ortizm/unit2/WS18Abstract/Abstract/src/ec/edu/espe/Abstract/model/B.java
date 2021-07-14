/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public abstract class B {             // 2
    private float f;                  // 2
    private double d;                 // 2
    ArrayList<G> gs = new ArrayList<>();        // 1

    
    public abstract int operation1(int n);      // 1
    
    public abstract float operation2(float f);  // 1

    
}
//the tostring, refactor, setters and getters are incomplete