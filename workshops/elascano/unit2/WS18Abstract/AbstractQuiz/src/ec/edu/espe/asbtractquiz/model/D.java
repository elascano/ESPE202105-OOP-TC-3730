/** Copyright ESPE-DECC
 */
package ec.edu.espe.asbtractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class D extends B {  //1

    private int x;      //1
    private int y;      //1

    public boolean m(int i) {   //1
        boolean result = false;
        if (i % 2 == 0) {
            result = true;
        }
        return result;
    }

    @Override
    public int operation1(int n) {     //1
        int result;
        result = n +2;
        return result;
    }

    @Override
    public float operation2(float f) {  //1
        float result;
        result = f/2.0F;
        return result;
    }

    public D(int x, int y, float f, double d, ArrayList<G> gs) { //1
        super(f, d, gs);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {  //1
        return "D{" + super.toString() + ", x=" + x + ", y=" + y + '}';
    }

    
    //2
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

}
