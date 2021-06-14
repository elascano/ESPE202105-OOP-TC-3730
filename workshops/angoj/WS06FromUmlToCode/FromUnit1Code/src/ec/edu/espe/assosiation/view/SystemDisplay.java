/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.assosiation.view;
import ec.edu.espe.assosiation.model.*;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class SystemDisplay {
     public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        
        a.setI(28);
        b.setA(100);
        b.setB(96);
        c.setF(11);
        d.setI(8);
        e.setC('k');
        f.setS("Hello World");
        System.out.println("Hello From System Display, \n"+"Johny Ango");
        
        System.out.println("a->"+a.getI());
        System.out.println("b->"+b.getA());
        System.out.println("b->"+b.getB());
        System.out.println("c->"+c.getF());
        System.out.println("d->"+d.getI());
        System.out.println("e->"+e.getC());
        System.out.println("f->"+f.getS());
     }
    
}
