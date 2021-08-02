package ec.edu.espe.conjunta.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
@author Luis Haro
 */
public class B extends A {
    private final List<H> hs = new ArrayList<>();
    
    public B() {
        System.out.println("B::B()");
        hs.add(new G(new J()));
    }

    @Override
    public String toString() {
        return "B{" + '}';
    }
}
