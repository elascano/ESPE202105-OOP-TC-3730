/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modell;

import ec.edu.espe.modell.G;
import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public abstract class B {
    private float f;
    private double d;
    ArrayList<G> gs = new ArrayList<>();

    
    public abstract int operation1(int n);
    
    public abstract float operation2(float f);

    
}