/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.diagram.view;

import ec.edu.espe.diagram.model.A;
import java.util.ArrayList;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Main {
    public static void main(String[] args) {
        
        A a;
        ArrayList <A> as;
        as = new ArrayList<>();
        a = new A(as);
        
        System.out.println("a ->" + a );
    }
   
}
