/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contact.model;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Product {
    private int id;
    private String name;
    private String description;
    private boolean product;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the product
     */
    public boolean isProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(boolean product) {
        this.product = product;
    }

    public Product(int id, String name, String description, boolean product) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.product = product;
    }

    
}
