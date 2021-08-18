/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventorymaterial.model;
import com.mongodb.BasicDBObject;

/**
 *
 * @author LAMESTech ESPE-DCC0
 */
public class Inventory {
    
    private String product;
    private String ID;
    private String fabricator;
    private String quantity;

 
      public Inventory(String product, String ID, String fabricator, String quantity) {
        this.product = product;
        this.ID = ID;
        this.fabricator = fabricator;
        this.quantity = quantity;
    }
    
    public Inventory(BasicDBObject dBObjectConcessionaire) {
        this.product = dBObjectConcessionaire.getString("product");
        this.ID =dBObjectConcessionaire.getString("ID");
        this.fabricator = dBObjectConcessionaire.getString("fabricator");
        this.quantity = dBObjectConcessionaire.getString("quantity");
        
    }
    
    
    public BasicDBObject dbMaterialObjectInventory(){
        
        BasicDBObject dbConcessionaire = new BasicDBObject();
        
        dbConcessionaire.append("Product", this.getProduct());
        dbConcessionaire.append("ID", this.getID());
        dbConcessionaire.append("Fabricator", this.getFabricator());
        dbConcessionaire.append("Quantity", this.getQuantity());
      
        
        return dbConcessionaire;
        
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the fabricator
     */
    public String getFabricator() {
        return fabricator;
    }

    /**
     * @param fabricator the fabricator to set
     */
    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

  

   

    
}
