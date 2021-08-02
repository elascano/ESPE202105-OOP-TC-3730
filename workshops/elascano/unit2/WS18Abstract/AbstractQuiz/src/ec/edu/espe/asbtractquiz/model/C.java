/** Copyright ESPE-DECC
 */
package ec.edu.espe.asbtractquiz.model;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class C {

    private ArrayList<H> hs = new ArrayList<>(); //2

    public void m(F f) {    //2
        System.out.println("inside method m of class C receiving an F -> " + f);
    }

    public float m(float f) {   //2
        float result;
        result = f * 5.0F;
        return result;
    }

    public C(ArrayList<H> hs) {   //1
        this.hs = hs;
    }

    @Override
    public String toString() {  //1
        return "C{" + "hs=" + hs + '}';
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {   //1
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {    //1
        this.hs = hs;
    }

}
