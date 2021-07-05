/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tourguest.view;

import ec.edu.espe.tourguest.model.*;

/**
 *
 * @author LILIAN IZA TOUR GUEST OPP-ESPE
 */
public class SysteamDisplay {
    public static void main(String[] args) {
      A a = new A();  
      B b = new B();
      C c = new C();
      D d = new D();
      E e = new E();
      F f = new F();
      
        a.setI(28);
        System.out.println("a.i ->"+ a.getI());
        System.out.println("From Class Diagram To Code, \n "+"Lilian Iza");
        
        a.setI(158);
        b.setA(567);
        b.setB(198);
        c.setF(125);
        d.setI(126); 
      
        
        System.out.println("a ->"+a);
        System.out.println("b ->"+b);
        System.out.println("c ->"+c);
        System.out.println("d ->"+d);
        System.out.println("e ->"+e);
        System.out.println("f ->"+f);
        
        
    }
}
