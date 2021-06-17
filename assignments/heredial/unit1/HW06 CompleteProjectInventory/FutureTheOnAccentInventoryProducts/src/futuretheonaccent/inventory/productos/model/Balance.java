/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.productos.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Balance {
    
    private float sales;
    private float purcharses;
    
    public void operation(){
    
} 

    @Override
    public String toString() {
        return "Balance{" + "sales=" + sales + ", purcharses=" + purcharses + '}';
    }

    /**
     * @return the sales
     */
    public float getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(float sales) {
        this.sales = sales;
    }

    /**
     * @return the purcharses
     */
    public float getPurcharses() {
        return purcharses;
    }

    /**
     * @param purcharses the purcharses to set
     */
    public void setPurcharses(float purcharses) {
        this.purcharses = purcharses;
    }
    
}
