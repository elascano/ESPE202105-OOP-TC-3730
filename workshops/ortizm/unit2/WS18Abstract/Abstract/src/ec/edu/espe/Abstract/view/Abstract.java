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
<<<<<<< HEAD
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
=======
       
                                               // (there is no object of type A)
                                                   // (does not have integers of aa or bb)
                                                   // (does not contain declarations of either a1 or a2)
                                                   // (does not have ace or bbs arrangements)
                                                   // (does not contain your ArrayList of type cs)
                                                   
                                                   //(does not contain data  TODO from keyboard)
                                                   
        System.out.println("Abstract GROUP 5");
        
        B b;
        
        b = new D(10, 5);   //0 (does not contain floating constructor parameters or ArrayList of type gs that are missing)
        System.out.println("b in int is -> " + b);  // (does not contain values ​​for b)
        System.out.println("b int is a class of -> " + b); // (his impression is the same as his other line without any meaning)
        
        b = new E(5.5F, 0.4F);
        System.out.println("b in Float is -> " + b.getClass());  // (does not contain values ​​what is sent to be printed)     
        ArrayList<B> bs = new ArrayList<>();
        bs.add(b);        
        System.out.println("b Float is a class of -> " + b.getClass());
    }
  
>>>>>>> 6cab8e267d92cf1302ae51b4a3bd9be3ce7805f9
    
    B b ;
    b= new D(x, y, f, d, gs);
    
        System.out.println("b -> "+b + "of type " + b.getClass().getName());
    }
}
