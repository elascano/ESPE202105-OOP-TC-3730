/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SortApp.model;

import java.util.ArrayList;

/**
 *
 * @author Victor Coba  Beta Software ESPE-DCCO
 */
public class Array {
    
    private ArrayList<Integer> datasOrdenated = new ArrayList<Integer>();
    private int tam;
    private ArrayList<String> datasNoOrdenated = new ArrayList<String>();
    private String algorithm;

    public Array(ArrayList<String> datasNoOrdenated,int tam,ArrayList<Integer> datasOrdenated,String algorithm) {
        this.tam = tam;
        this.algorithm = algorithm;
        this.datasOrdenated = datasOrdenated;
        this.datasNoOrdenated = datasNoOrdenated;
    }

    public ArrayList<Integer> getDatasOrdenated() {
        return datasOrdenated;
    }

    public void setDatasOrdenated(ArrayList<Integer> datasOrdenated) {
        this.datasOrdenated = datasOrdenated;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public ArrayList<String> getDatasNoOrdenated() {
        return datasNoOrdenated;
    }

    public void setDatasNoOrdenated(ArrayList<String> datasNoOrdenated) {
        this.datasNoOrdenated = datasNoOrdenated;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public String toString() {
        return "Unsorted"+datasNoOrdenated+"Size"+tam +"Sort algorithm"+datasOrdenated+"Algorithm"+algorithm;
    }
    
}
