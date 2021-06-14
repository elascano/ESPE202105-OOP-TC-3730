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
public class Warehouse {
    
    private Capacity[] capacity;
    private Supplies[] supplies;
    private String category;
    
    
    public void checkStock(){
        
    }
    public void checkLoads(){
        
    }
    public Supplies orderSupplies(){
        
        Supplies supplie = new Supplies();
        
        return supplie;
                
    }

    @Override
    public String toString() {
        return "Warehouse{" + "capacity=" + capacity + ", supplies=" + supplies + ", category=" + category + '}';
    }

    /**
     * @return the capacity
     */
    public Capacity[] getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(Capacity[] capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the supplies
     */
    public Supplies[] getSupplies() {
        return supplies;
    }

    /**
     * @param supplies the supplies to set
     */
    public void setSupplies(Supplies[] supplies) {
        this.supplies = supplies;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
   
}
