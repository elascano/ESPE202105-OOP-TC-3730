/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associattions.view;

import ec.edu.espe.associattions.model.*;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
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
        b.setA(58);
        b.setB(12);
        c.setF((float) 14.5);
        d.setI(8547);
        e.setC('A');
        f.setS("AndresG");
        
        System.out.println("a.b ->"+ a.getI());
        
        System.out.println("From Class Diagram to Code, \n "
        + "Andres Galarza");
        
        System.out.println("A ->"+a);
        System.out.println("B ->"+b);
        System.out.println("C ->"+c);
        System.out.println("D ->"+d);
        System.out.println("E ->"+e);
        System.out.println("F ->"+f);
    }
}
