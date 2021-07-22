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

    public D(int x, int y) {
        this.x = x;
        this.y = y;
<<<<<<< HEAD
=======
public class D extends B{
    private int x;
    private int y;

    public D(float f, double d) {
        super(f, d);
>>>>>>> ace332268e238da37ba90259b9d6acb921c352de
    }

    @Override // falta la concatenacion 0,5
    public String toString() {
        return "D{" + "x=" + x + super.toString() + ", y=" + y + '}';
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

}
// no tiene la programacion de los metodos abstractos 0
//0