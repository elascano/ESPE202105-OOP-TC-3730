/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Abstract.view;



import ec.edu.espe.Abstract.model.A;
import ec.edu.espe.Abstract.model.B;
import ec.edu.espe.Abstract.model.C;
import ec.edu.espe.Abstract.model.D;
import ec.edu.espe.Abstract.model.G;
import java.util.ArrayList;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /**
      A a;
     int aa;
     int bb;
     A a1;
     A a2;
     A[] as;
     B[] bs;
     ArrayList<C> cs;
     
     
     aa=5;
     bb=10;
     a1= new A();
     a2= new A();
     as=  new A[2];
     bs = new B[5];
     cs = new ArrayList <> ();
     
     a= new A(aa, bb, a1, a2, as, bs, cs) */

    int x;
    int y;
    float f;
    double d;
    ArrayList<G> gs = new ArrayList<>();

    x=1;
    y=2;
    f= 1.0F;
    d= 12.98F;
    
    B b ;
    b= new D(x, y, f, d, gs);
    
        System.out.println("b -> "+b + "of type " + b.getClass().getName());
    }
}
