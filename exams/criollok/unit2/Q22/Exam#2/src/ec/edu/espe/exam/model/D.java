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
public class D { //0.2
      E[] ed = new E[5];//0.1 missing private
    ArrayList<F> fd;// 0.1

    public D(ArrayList<F> fd) { //0.2 needs completing
        this.fd = fd;
    }

    @Override
    public String toString() {
        return "D{" + "ed=" + Arrays.toString(ed) + ", fd=" + fd + '}';
    }
    
    
}
