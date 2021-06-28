/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class SystemDisplay {
    public static void main(String[] args) {
        A a = new A(); 
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        
        a.setI(28); 
        System.out.println("a.i -> " + a.getI());
        
        System.out.println("From Class Diagram to Code. \n "
                 +"Fernanda Cadena"); 
        
        
        a.setI(345);
        
        System.out.println("a -> " + a);
        
        b.setA(567);
        b.setB(198); 
        
        System.out.println("b -> " + b);
        
        c.setF((float) 3.56);
       
        System.out.println("c -> " + c);
        
        d.setI(456);
        
        System.out.println("d -> " + d);
        
        e.setC((char) 'h');
        
        System.out.println("e -> " + e);
        
        System.out.println("f -> " + f); 


        
    }
    
}
