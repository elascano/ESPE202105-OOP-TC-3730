/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class G implements H{

    public G() {
    }

    @Override
    public String toString() {
        return "G{" + '}';
    }

    @Override
    public void b(B bs) {
        System.out.println("B -> " + bs);
    }
    
}
