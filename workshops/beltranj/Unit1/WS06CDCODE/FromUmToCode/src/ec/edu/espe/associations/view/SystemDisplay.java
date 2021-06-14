/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.associations.model.*;
/**
 *
 * @author Jennifer Beltran Team of machine Developers
 */
public class SystemDisplay {
    public static void main(String[] args  ){
      A a= new A();
      B b= new B();
      C c= new C();
      D d= new D();
      E e= new E();
      F f= new F();
      
      b.setA(28);
      b.setB(34);
      e.setC('J');
      f.setS("Jennifer");
      c.setF((float)5.4);
      d.setI(67);
      
      System.out.println("a.i -->" + a.getI());
      System.out.println("from class diagram to code" );
      System.out.println("a -->" + a);
      System.out.println("b -->" + b);
      System.out.println("c -->" + c);
      System.out.println("d -->" + d);
      System.out.println("e -->" + e);
      System.out.println("f -->" + f);
    }
    
    
}
