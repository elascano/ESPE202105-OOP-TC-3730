/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associattions.view;

import ec.edu.espe.associattions.model.*;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
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
        System.out.println("a.b ->" + a.getI());
        
        System.out.println("Hello From Display " + "Josselyn Sigcha");                  
        
        b.setA(567);
        b.setB(198);
        c.setF(2.4F);
        d.setI(8);
        e.setC('k');
        f.setS("Josselyn");
        
        
        System.out.println("a ->" + a);
        
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
        System.out.println("c -> " + c);
        System.out.println("d -> " + d);
        System.out.println("e -> " + e);
        System.out.println("f -> " + f);
    }
    
}
