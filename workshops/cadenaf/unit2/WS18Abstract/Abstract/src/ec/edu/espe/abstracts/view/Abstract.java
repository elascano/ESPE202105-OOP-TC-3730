/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.abstracts.view;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//    aa = 5; 
//    bb = 10; 
//    a1 = new A(); 
//    a2 = new A(); 
//    as = new A[2]; 
//    bbs = new B[5]; 
//    cs = new ArrayList<>(); 
    
//    a = new A(aa, bb, a1, a2, as, bbs, cs);
 //   a = new A(); 
 //       System.out.println("a -> " + a);
  //  }
    
    int x; 
    int y; 
    float f; 
    double d; 
    ArrayList<G> gs = new ArrayList<>(); 
    
    x = 1; 
    y = 2; 
    f = 1.0F; 
    d = 12.00F; 
    
    B b; 
    b = new D(x, y, f, d, gs); 
 
    System.out.println("b ->" + b + " of type " + b.getClass().getName());
    
    b = new E(f, f, f, d, gs); 
    System.out.println("b ->" + b + " of type " + b.getClass().getName());
    
}
