/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import ec.edu.espe.associations.model.A;
import ec.edu.espe.associations.model.B;
import ec.edu.espe.associations.model.C;
import ec.edu.espe.associations.model.D;
import ec.edu.espe.associations.model.E;
import ec.edu.espe.associations.model.F;

/**
 *
 * @author Lizeth Taco Future ProgrammsTech ESPE-DCCIO
 */
public class ConvertionUnits {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        
        
         a.setI(28);
        System.out.println("a.i ->" + a.getI());
        System.out.println("From Class Diagram to Code,\n"
                + "Lizeth Taco");
        b.setA(47);
        b.setB(78);
        c.setF(2.8F);
        d.setI(8);
        e.setC("L");
        f.setS("LIZETH TACO");
                
        System.out.println("a ->" + a);
        System.out.println("b ->" + b);
        System.out.println("c ->" + c);
        System.out.println("d ->" + d);
        System.out.println("e ->" + e);
        System.out.println("f ->" + f);
           
       
         
    }
       
    }

