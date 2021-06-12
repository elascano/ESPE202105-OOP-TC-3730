/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Jorge Guayasamin AccentOnTheFutureTech ESPE-DCCO
 */
public class SystemDisplay {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
              
        
        //a.setI(28);
        System.out.println("a.i -> " + a.getI());
        
        System.out.println("From Class Diagram To Code, \n"
                + "Jorge Guayasamin");
        
        a.setI(150);
        
        b.setA(120);
        b.setB(324);
        
        c.setF((float) 780.63);
        
        d.setI(452);
        
        e.setC('K');
       
      
        
        System.out.println("A ->" + a);
        System.out.println("B ->" + b);
        System.out.println("C ->" + c);
        System.out.println("D ->" + d);
        System.out.println("E ->" + e);
        System.out.println("F ->" + f);
        
        
        
        
        
    }
    
}
