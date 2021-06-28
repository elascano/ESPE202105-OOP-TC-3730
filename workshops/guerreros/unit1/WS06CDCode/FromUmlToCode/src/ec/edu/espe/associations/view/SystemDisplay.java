/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import edu.espe.associations.model.*;



/**
 *
 * @author Stefany Guerrero AccentOntheFuture ESPE-DCC0
 */
public class SystemDisplay {
    public static void main(String[]args){
        A a = new A(); 
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();  
        a.setI(28);
        System.out.println("a.b ->" + a.getI());
        
        System.out.println("From Class Diagram to code, \n" + "Stefany Guerrero ");  
        
        b.setA(567);
        b.setB(198);
        c.setF((float) 85.5);
        d.setI(985);
        e.setC('A');
        f.setS("Stefany");
        
               
        
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);        
        System.out.println("c -> " + c);
        System.out.println("d -> " + d);
        System.out.println("e -> " + e);
        System.out.println("f -> " + f);
    }
    
}
