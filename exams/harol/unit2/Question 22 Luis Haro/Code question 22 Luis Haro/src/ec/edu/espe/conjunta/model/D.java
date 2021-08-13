package ec.edu.espe.conjunta.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Haro
 */
public class D extends A {//0.2
    private List<F> fs = new ArrayList<>();//0.2
    private E es[] = new E[5];//0.2

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
    
    public D() {//0 constructor incomplete array incomplete
        System.out.println("D::D()");
        fs.add(new F());
        
        es[0] = new E();
        es[1] = new E();
        es[2] = new E();
        es[3] = new E();
        es[4] = new E();
    }
}
