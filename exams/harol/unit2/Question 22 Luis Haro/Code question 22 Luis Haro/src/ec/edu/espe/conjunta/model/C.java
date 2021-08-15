package ec.edu.espe.conjunta.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Haro
 */
public class C extends A {//0.4
    private List<E> es = new ArrayList<>();//0.4
    
    public C() {//0
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
