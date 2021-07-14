/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.model.A;
import ec.edu.espe.model.B;
import ec.edu.espe.model.C;
import ec.edu.espe.model.D;
import ec.edu.espe.model.E;
import ec.edu.espe.model.F;
import ec.edu.espe.model.G;

/**
 *
 * @author Estefania
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       A a = new A();
       B b = new B();
       C c = new C();
       D d = new D();
       E e = new E(); 
       F f = new F();
       G g = new G();
        
        a.setI(28);
        b.setA(876);
        b.setB(24);
        c.setF(3);
        d.setI(655);
        e.setC('m');
        f.setS("Hello Estefania");
        System.out.println("a.i ->" + a.getB());
        System.out.println("Abstract to Code,\n" 
                + "Andrea Quichimbo"
                + "Karen Quilumbaquin"
                + "Cristopher Sarmiento");
        
        System.out.println("a->"+a);
        System.out.println("b->"+b);
        System.out.println("c->"+c);
        System.out.println("d->"+d);
        System.out.println("e->"+e);
        System.out.println("f->"+f);
        System.out.println("g->"+g);
    }
    }
    

