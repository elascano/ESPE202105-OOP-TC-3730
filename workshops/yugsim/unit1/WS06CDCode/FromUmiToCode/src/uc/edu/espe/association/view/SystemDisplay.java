/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc.edu.espe.association.view;

import uc.edu.espe.association.model.*;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCD
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
        
        System.out.println("From Class Diagram To Code, \n"
                        + "Pamela Yugsi");
        
        b.setA(567);
        b.setB(158);
        
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
        System.out.println("c -> " + c);
        System.out.println("d -> " + d);
        System.out.println("e -> " + e);
        System.out.println("f -> " + f);
    }
}