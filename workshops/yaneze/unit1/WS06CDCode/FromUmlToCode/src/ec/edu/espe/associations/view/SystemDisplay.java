/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
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
        b.setA(10);
        b.setB(50);
        c.setF((float) 76.9);
        d.setI(10000);
        e.setC('E');
        f.setS("ErickString");
                
        System.out.println("a.b--> " + a.getI());
        System.out.println("From Class Diagram to Code,\n Erick Yánez");
        System.out.println("A ->" + a);
        System.out.println("B ->" + b);
        System.out.println("C ->" + c);
        System.out.println("D ->" + d);
        System.out.println("E ->" + e);
        System.out.println("F ->" + f);
    }
}
