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
public class E { // falta el extends B 0
    private float p; //1
    private float q;//1

    
    public E(float p, float q) { //son 5 parametros y tienen solo 2 0,5
        this.p = p;
        this.q = q;
public class E extends B{
    private float p;
    private float q;

    public E(float f, double d) {
        super(f, d);
    }

    @Override // falta el + super.toString() 0,5
    public String toString() {
        return "E{" + "p=" + p + ", q=" + q + '}';
    }
    
    public static int m1(int i){ // falta completar el metodo 0,5
        return 0;
    }

    /**
     * @return the p
     */
    public float getP() { //1
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(float p) {//0,5
        this.p = p;
    }

    /**
     * @return the q
     */
    public float getQ() { 
        return q;
    }

    /**
     * @param q the q to set
     */
    public void setQ(float q) {
        this.q = q;
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
// falta completar los metodos del papa 0
//0