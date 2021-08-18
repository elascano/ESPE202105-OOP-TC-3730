/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.electronicelement.model;
import com.mongodb.BasicDBObject;


/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Electronic {
    private String product;
    private String brand;
    private String ID;
    private String quantity;

    public Electronic(String product, String brand, String ID, String quantity) {
        this.product = product;
        this.brand = brand;
        this.ID = ID;
        this.quantity = quantity;
    }
    
    public Electronic(BasicDBObject dBObjectConcessionaire) {
        this.product = dBObjectConcessionaire.getString("product");
        this.brand =dBObjectConcessionaire.getString("brand");
        this.ID = dBObjectConcessionaire.getString("ID");
        this.quantity = dBObjectConcessionaire.getString("quantity");
        
    }
    
    
    public BasicDBObject dbMaterialObjectInventory(){
        
        BasicDBObject dbConcessionaire = new BasicDBObject();
        
        dbConcessionaire.append("Product", this.getProduct());
        dbConcessionaire.append("brand", this.getBrand());
        dbConcessionaire.append("ID", this.getID());
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
