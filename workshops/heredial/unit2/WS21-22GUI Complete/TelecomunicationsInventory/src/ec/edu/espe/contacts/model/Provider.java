/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

import java.time.LocalDateTime;
import java.util.ArrayList;


/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Provider {
    private String name;
    private String lastName;
    private String cI;
    private String tax;
    private String password;
    private String pay;
    private LocalDateTime date;
    private ArrayList<Product> product;
    
    private ArrayList<Product> products = new ArrayList<>();

    public Provider(String name, String lastName, String cI, String tax, String password, String pay, LocalDateTime date, ArrayList<Product> product) {
        this.name = name;
        this.lastName = lastName;
        this.cI = cI;
        this.tax = tax;
        this.password = password;
        this.date = date;
        this.product = product;
        this.pay = pay;
        
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the cI
     */
    public String getcI() {
        return cI;
    }

    /**
     * @param cI the cI to set
     */
    public void setcI(String cI) {
        this.cI = cI;
    }

    /**
     * @return the tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the date
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     * @return the product
     */
    public ArrayList<Product> getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ArrayList<Product> product) {
        this.product = product;
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
     * @return the pay
     */
    public String getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(String pay) {
        this.pay = pay;
    }

  
    
    
 

   

     
    
}
