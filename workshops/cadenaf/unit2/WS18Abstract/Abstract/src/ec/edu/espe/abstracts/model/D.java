/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstracts.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class D {
  private int x;       //1
  private int y;   //1
  
  public boolean m(int i){
          
     return i;    
  }

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

    public D(int x, int y) {    //1
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "D{" + "x=" + x + ", y=" + y + '}';   //1
    }
  
  
}
