package ec.edu.espe.conjunta.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Haro
 */
public class C extends A {
    private List<E> es = new ArrayList<>();
    
    public C() {
        System.out.println("C::C()");
        es.add(new E());
    }

    public List<E> getEs() {
        return es;
    }

    public void setEs(List<E> es) {
        this.es = es;
    }

    @Override
    public String toString() {
        return "C{" + '}';
    }
}
