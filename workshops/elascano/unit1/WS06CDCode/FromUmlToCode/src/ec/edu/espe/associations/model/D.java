/** Copyright ESPE-DECC
*/

package ec.edu.espe.associations.model;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class D {
    private int i;
    
    
    public B m(){
        B b = new B();
        
        return b;
    }
    
    public int m(F f){
        
        return 0;
    }

    @Override
    public String toString() {
        return "D{" + "i=" + i + '}';
    }

    
    
    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

}
