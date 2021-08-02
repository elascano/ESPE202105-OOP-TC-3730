package ec.edu.espe.conjunta.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Haro
 */
public class D extends A {
    private List<F> fs = new ArrayList<>();
    private E es[] = new E[5];

    public List<F> getFs() {
        return fs;
    }

    public void setFs(List<F> fs) {
        this.fs = fs;
    }

    public E[] getEs() {
        return es;
    }

    public void setEs(E[] es) {
        this.es = es;
    }
    
    public D() {
        System.out.println("D::D()");
        fs.add(new F());
        
        es[0] = new E();
        es[1] = new E();
        es[2] = new E();
        es[3] = new E();
        es[4] = new E();
    }
}
