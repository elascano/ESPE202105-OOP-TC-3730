/*
 */
package ec.edu.espe.associattions.model;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class D {
    private int i;

    @Override
    public String toString() {
        return "D{" + "i=" + i + '}';
    }
    
    
    public B m(){
        B b = new B();
        
        return b;
        
    }
    
    public int m(F f){
        
        return 0;
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
