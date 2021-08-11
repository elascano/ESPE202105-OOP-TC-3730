/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.view;

import ec.edu.espe.exam.model.A;
import ec.edu.espe.exam.model.B;
import ec.edu.espe.exam.model.C;
import ec.edu.espe.exam.model.H;
import ec.edu.espe.exam.model.J;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class Exam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         A a;     
        a = new B();        
        J j = new J();
        G g = new G();
        H h = new H();
        g.m(j);
        a = new C();
        a = new B();
    }
    
}
