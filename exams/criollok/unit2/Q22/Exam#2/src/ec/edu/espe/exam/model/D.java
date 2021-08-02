/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class D {
      E[] ed = new E[5];
    ArrayList<F> fd;

    public D(ArrayList<F> fd) {
        this.fd = fd;
    }

    @Override
    public String toString() {
        return "D{" + "ed=" + Arrays.toString(ed) + ", fd=" + fd + '}';
    }
    
    
}
