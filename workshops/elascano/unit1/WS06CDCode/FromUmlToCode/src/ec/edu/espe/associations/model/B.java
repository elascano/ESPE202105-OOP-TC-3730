/** Copyright ESPE-DECC
*/

package ec.edu.espe.associations.model;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class B {
    private int a;
    private int b;
    private E[] es = new E[5];
    
    public C m1(F f){
        C c = new C();
        
        return c;
    }

    @Override
    public String toString() {
        return "B{" + "a=" + a + ", b=" + b + ", es=" + es + '}';
    }

    
    
    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the es
     */
    public E[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(E[] es) {
        this.es = es;
    }

}
