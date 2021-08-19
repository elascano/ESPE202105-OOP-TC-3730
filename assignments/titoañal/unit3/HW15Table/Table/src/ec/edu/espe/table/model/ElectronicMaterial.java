/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.table.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class ElectronicMaterial {
    private String Product;
    private String Price;
    private String Fabricator;
    private String Quantity;

    
    public ElectronicMaterial(BasicDBObject dBObjectInventory) {
        this.Product = dBObjectInventory.getString("Product");
        this.Price =dBObjectInventory.getString("Price");
        this.Fabricator = dBObjectInventory.getString("Fabricator");
        this.Quantity = dBObjectInventory.getString("Quantity");
        
    }
    
    public BasicDBObject dbElectronicMaterialObjectInventory(){
        
        BasicDBObject dbInventory = new BasicDBObject();
        
        dbInventory.append("Product", this.getProduct());
        dbInventory.append("Prce", this.getPrice());
        dbInventory.append("Fabricator", this.getFabricator());
        dbInventory.append("Quantity", this.getQuantity());
      
        
        return dbInventory;
        
    }

    public ElectronicMaterial(String Product, String Price, String Fabricator, String Quantity) {
        this.Product = Product;
        this.Price = Price;
        this.Fabricator = Fabricator;
        this.Quantity = Quantity;
    }

    /**
     * @return the Product
     */
    public String getProduct() {
        return Product;
    }

    /**
     * @param Product the Product to set
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * @return the Price
     */
    public String getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * @return the Fabricator
     */
    public String getFabricator() {
        return Fabricator;
    }

    /**
     * @param Fabricator the Fabricator to set
     */
    public void setFabricator(String Fabricator) {
        this.Fabricator = Fabricator;
    }

    /**
     * @return the Quantity
     */
    public String getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    
    
}
