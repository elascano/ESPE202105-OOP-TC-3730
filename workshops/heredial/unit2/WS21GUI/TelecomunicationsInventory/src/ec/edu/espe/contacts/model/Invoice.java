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
public class Invoice {
    private String Name;
    private String LastName;
    private int CI;
    private float Tax;
    private int password;
    private LocalDateTime date;
     private ArrayList<Product> product;
    
    ArrayList<Product> products = new ArrayList<>();

    public Invoice(String Name, String LastName, int CI, float Tax, int password, LocalDateTime date, ArrayList<Product> product) {
        this.Name = Name;
        this.LastName = LastName;
        this.CI = CI;
        this.Tax = Tax;
        this.password = password;
        this.date = date;
        this.product = product;
    }

 
    
 

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the CI
     */
    public int getCI() {
        return CI;
    }

    /**
     * @param CI the CI to set
     */
    public void setCI(int CI) {
        this.CI = CI;
    }

   

    /**
     * @return the Tax
     */
    public float getTax() {
        return Tax;
    }

    /**
     * @param Tax the Tax to set
     */
    public void setTax(float Tax) {
        this.Tax = Tax;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
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

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

     
    
}
