/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.contacts.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Product {
  private String nameProduct;
   private float price;
   private int amount;
   private Date dateOfSale;

    public Product(String nameProduct, float price, int amount, Date dateOfSale) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.amount = amount;
        this.dateOfSale = dateOfSale;
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
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the dateOfSale
     */
    public Date getDateOfSale() {
        return dateOfSale;
    }

    /**
     * @param dateOfSale the dateOfSale to set
     */
    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

}
