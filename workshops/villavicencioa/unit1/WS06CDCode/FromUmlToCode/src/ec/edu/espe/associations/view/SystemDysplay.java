/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.*;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class SystemDysplay {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        C c= new C();
        D d= new D();
        E e= new E();
        F f= new F();
        
        a.setI(28);
        System.out.println("a.b ->" +a.getI());
        System.out.println ("From  Diagram to Code, \n"
            + "Alina Villavicencio");
        

        b.setA(567);
        b.setB(198);
        c.setF(34.67f);
        d.setI(63);
        e.setC('a');
        f.setS("Alina Villavicencio");
        
        
        System.out.println("a ->" +a);
        System.out.println("b ->" +b);
        System.out.println("c ->" +c);
        System.out.println("d ->" +d);
        System.out.println("e ->" +e);
        System.out.println("f ->" +f);
        
    }
}
