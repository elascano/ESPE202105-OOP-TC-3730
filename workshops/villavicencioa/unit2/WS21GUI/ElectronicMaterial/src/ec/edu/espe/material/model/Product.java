/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.material.model;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Product {
    private int id;
    private String nameProduct;

    public Product(int id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nameProduct
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * @param nameProduct the nameProduct to set
     */
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    
}
