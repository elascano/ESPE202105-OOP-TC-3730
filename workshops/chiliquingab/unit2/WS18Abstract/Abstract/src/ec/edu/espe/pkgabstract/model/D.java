/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pkgabstract.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class D { // falta Extends B  0
    private int x; //1
    private int y; //1

    public D(int x, int y) { //falta completar el constructor 0,5
        this.x = x;
        this.y = y;
public class D extends B{
    private int x;
    private int y;

    public D(float f, double d) {
        super(f, d);
    }

    @Override // falta la concatenacion 0,5
    public String toString() {
        return "D{" + "x=" + x + ", y=" + y + '}';
    }
    
    public static boolean m(int i){ // falta completar el metodo  0,5
        
        return false;
    }

    /**
     * @return the x
     */
    public int getX() { //1
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

    @Override
    public void operation1(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float operation2(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
// no tiene la programacion de los metodos abstractos 0
//0