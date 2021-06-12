/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.view;

import ec.edu.associations.model.*;

/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class FromUmlToCode {
   
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E(); 
        F f = new F();
        
        a.setI(28);
        b.setA(876);
        b.setB(24);
        c.setF(3);
        d.setI(655);
        e.setC('m');
        f.setS("Hello Estefania");
        System.out.println("a.i ->" + a.getB());
        System.out.println("From Class Diagram to Code,\n" + "Andrea Quichimbo");
        
        System.out.println("a->"+a);
        System.out.println("b->"+b);
        System.out.println("c->"+c);
        System.out.println("d->"+d);
        System.out.println("e->"+e);
        System.out.println("f->"+f);
        
    }
   
       
}
