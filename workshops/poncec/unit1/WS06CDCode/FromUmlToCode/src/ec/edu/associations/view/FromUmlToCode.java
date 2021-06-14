/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import ec.edu.associations.model.*;

/**
 *
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class FromUmlToCode {
   
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E(); 
        F f = new F();
        
        a.setI(35);
        b.setA(67);
        b.setB(243);
        c.setF(356);
        d.setI(64);
        e.setC('m');
        f.setS("Hello Camilo");
        System.out.println("a.i ->" + a.getB());
        System.out.println("From Class Diagram to Code,\n" + "Camilo Ponce");
        
        System.out.println("a->"+a);
        System.out.println("b->"+b);
        System.out.println("c->"+c);
        System.out.println("d->"+d);
        System.out.println("e->"+e);
        System.out.println("f->"+f);
        
    }
   
       
}
