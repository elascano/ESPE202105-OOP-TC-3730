/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventory.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Inventory {

    public static void add(Inventory inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String name;
    private String description;
    private LocalDateTime DateofSale;
    private ArrayList<Product> products;
    private float price;
    private int code;
    private int quantity;

    public Inventory(String name, String description, LocalDateTime DateofSale, ArrayList<Product> products, float price, int code, int quantity) {
        this.name = name;
        this.description = description;
        this.DateofSale = DateofSale;
        this.products = products;
        this.price = price;
        this.code = code;
        this.quantity = quantity;
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
     * @return the DateofSale
     */
    public LocalDateTime getDateofSale() {
        return DateofSale;
    }

    /**
     * @param DateofSale the DateofSale to set
     */
    public void setDateofSale(LocalDateTime DateofSale) {
        this.DateofSale = DateofSale;
    }

    /**
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}