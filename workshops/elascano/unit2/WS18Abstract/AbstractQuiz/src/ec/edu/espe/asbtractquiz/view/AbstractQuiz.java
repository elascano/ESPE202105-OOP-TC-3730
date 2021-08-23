/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.asbtractquiz.view;

import ec.edu.espe.asbtractquiz.model.B;
import ec.edu.espe.asbtractquiz.model.D;
import ec.edu.espe.asbtractquiz.model.E;
import ec.edu.espe.asbtractquiz.model.G;

import java.util.ArrayList;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class AbstractQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        A a;
//        int aa;
//        int bb;
//        A a1;
//        A a2;
//        A[] as;
//        B[] bbs;
//        ArrayList<C> cs;
//
//        //TODO read from keyboard
//        aa = 5;
//        bb = 10;
//        a1 = new A();
//        a2 = new A();
//        as = new A[2];
//        bbs = new B[5];
//        cs = new ArrayList<>();
//
//        //a = new A(aa, bb, a1, a2, as, bbs, cs);
//        a = new A();
//        System.out.println("a -> " + a );

        int x;
        int y;
        float f;
        double d;
        ArrayList<G> gs = new ArrayList<>();

        x = 1;
        y = 2;
        f = 1.0F;
        d = 12.98F;

        B b;
        b = new D(x, y, f, d, gs);

        System.out.println("b -> " + b + " of type " + b.getClass().getName());

        b = new E(f, f, f, d, gs);

        System.out.println("b -> " + b + " of type " + b.getClass().getName());

    }

}
