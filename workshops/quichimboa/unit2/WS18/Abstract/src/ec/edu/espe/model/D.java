/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Estefania
 */
public class D { //0 Not E extends
    private int x; //1
    private int y; //1 
    
 public static boolean m(int i){
        
        return false;
  // Return not is correct
    }

    public D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //0 Constructor is incomplete

    public D() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "D{" + "x=" + x + ", y=" + y + '}';
    }
    //2
// To String incomplete
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
