/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class Data {
    private String data;

    @Override
    public String toString() {
        return "Data{" + "data=" + data + '}';
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
    
}
