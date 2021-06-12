/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class SystemDisplay {
    public static void main(String[] args) {
        A a = new A ();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        
        a.setI(28);
        System.out.println("a.i ->" + a.getI());
        
        System.out.println("From Class Diagram to Code \n " + "Kevin Criollo");
        
        b.setA(567);
        b.setB(198);
        c.setF(2.9F);
        d.setI(69);
        e.setC('g');
        f.setS("kevin");
        
        
        
        
        System.out.println("a->" + a);
        
        System.out.println("b->" + b);
        System.out.println("c->" + c);
        System.out.println("d->" + d);
        System.out.println("e->" + e);
        System.out.println("f->" + f);
        
        
        
        
        
        
        
    }
}
