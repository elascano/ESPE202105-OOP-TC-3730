/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

import java.util.ArrayList;

/**
 *
 * @author Jennifer Beltran
 */
public class D { //0,2 It doesn't have the inheritance, it doesn't have the es array, it doesn't have the constructor


    private ArrayList<F> fs = new ArrayList<>();//0,2

    @Override
    public String toString() {
        return "D{" + "fs=" + getFs() + '}';
    }
    
    public D(){
        
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }
}
