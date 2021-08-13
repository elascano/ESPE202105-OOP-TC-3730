package ec.edu.espe.conjunta.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 @author Luis Haro
 */
public class A {  //0.5
    private List<A> as = new ArrayList<>(); //0.5
    
    public A() {
        System.out.println("A::A()");
    }
    
    public void addA(A a) {
        as.add(a);
    }

    public List<A> getAs() {
        return as;
    }

    public void setAs(List<A> as) {
        this.as = as;
    }

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }
}
