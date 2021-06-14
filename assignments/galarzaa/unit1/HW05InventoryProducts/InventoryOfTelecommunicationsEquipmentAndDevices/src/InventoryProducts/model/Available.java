/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryProducts.model;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Available {

    private int amount;
    private boolean stock;

    public void searchStock(boolean stock) {

    }

    @Override
    public String toString() {
        return "Available{" + "amount=" + amount + ", stock=" + stock + '}';
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
     * @return the stock
     */
    public boolean isStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(boolean stock) {
        this.stock = stock;
    }

}
