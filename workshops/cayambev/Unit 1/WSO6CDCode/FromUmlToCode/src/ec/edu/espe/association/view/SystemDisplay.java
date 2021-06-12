/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.association.view;
import ec.edu.espe.association.model.*;
/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class SystemDisplay {
        public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
                
        a.setI(64);
        b.setA(10);
        b.setB(45);
        c.setF((float) 34.5);
        d.setI(75);
        e.setC('V');
        f.setS("Vanessa");
        
        System.out.println("a.b -> "+ a.getI());
        System.out.println("From Class Diagram to Code");   
        System.out.println("a -> " +  a);
        System.out.println("b -> " +  b);
        System.out.println("c -> " +  c);
        System.out.println("d -> " +  d);
        System.out.println("e -> " +  e);
        System.out.println("f -> " +  f);
    }
}



