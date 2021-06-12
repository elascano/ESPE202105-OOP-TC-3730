/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.assosations.view;

import ec.edu.espe.assosations.model.*;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class SystemDisplay {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        C c=new C();
        D d=new D();
        E e=new E();
        F f=new F();
        
         a.setI(1);
        b.setA(20);
        b.setB(70);
        c.setF((float) 88.5);
        d.setI(1000);
        e.setC('F');
        f.setS("MarlonOrtiz3730");
        
        
        
        
         a.setI(28);
        System.out.println("a.b->" + a.getI());
        
        System.out.println("From Class Diagram to Code, \n Marlon Ortiz ");
        
        System.out.println("A->" + a);
        System.out.println("B->" + b);
        System.out.println("C->" + c);
        System.out.println("D->" + d);
        System.out.println("E->" + e);
        System.out.println("F->" + f);
    }
}
