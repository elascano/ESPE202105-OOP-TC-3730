package ec.edu.espe.conjunta.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
@author Luis Haro
 */
public class B extends A {//0.4
    private final List<H> hs = new ArrayList<>();//0
    
    public B() {//0 imcomplete constructor arrayList<G> 
        System.out.println("B::B()");
        hs.add(new G(new J()));
    }

    @Override
    public String toString() {
        return "B{" + '}';
    }
}
