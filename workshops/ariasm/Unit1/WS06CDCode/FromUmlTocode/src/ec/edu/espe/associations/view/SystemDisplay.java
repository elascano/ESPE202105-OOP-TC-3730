/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Marco Arias SkyNet.hubtech ESPE-DCCO
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
        b.setA(20);
        b.setB(30);
        c.setF((float) 30.5);
        d.setI(40);
        e.setC('M');
        f.setS("MarcoString");
        
        System.out.println("a.b -> " + a.getI());
        System.out.println("From Class Diagram to Code");   
        System.out.println("a -> " +  a);
        System.out.println("b -> " +  b);
        System.out.println("c -> " +  c);
        System.out.println("d -> " +  d);
        System.out.println("e -> " +  e);
        System.out.println("f -> " +  f);
    }
}
