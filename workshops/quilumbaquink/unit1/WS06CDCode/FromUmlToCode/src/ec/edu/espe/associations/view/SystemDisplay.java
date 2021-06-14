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
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class SystemDisplay {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        C c=new C();
        D d=new D();
        E e=new E();
        F f=new F();
        a.setI(28);
        System.out.println("a.b ->"+ a.getI());
        
        System.out.println("Hello From System Display, \n"
                           +"Karen Quilumbaquin");
        b.setA(51);
        b.setB(198);
        c.setF(14);
        d.setI(589);
        e.setC('c');
        f.setS("Hello World");
        
        System.out.println("b ->"+b.getA());
        System.out.println("b ->"+b.getB());
        System.out.println("c ->"+c.getF());
        System.out.println("d ->"+d.getI());
        System.out.println("e ->"+e.getC());
        System.out.println("f ->"+f.getS());
        
        }
    }

