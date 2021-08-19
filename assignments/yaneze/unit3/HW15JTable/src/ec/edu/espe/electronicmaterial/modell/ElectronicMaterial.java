/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.electronicmaterial.modell;
import com.mongodb.BasicDBObject;

/**
 *
 * @author Erick Yánez LAMESTech
 */
public class ElectronicMaterial {
    
    private String ID;
    private String Material;
    private String fabricator;
    private String quantity;

 
      public ElectronicMaterial(String ID, String Material, String fabricator, String quantity) {
        this.ID = ID;
        this.Material = Material;
        this.fabricator = fabricator;
        this.quantity = quantity;
    }
    
    public ElectronicMaterial(BasicDBObject dBObjectConcessionaire) {
        this.ID = dBObjectConcessionaire.getString("ID");
        this.Material =dBObjectConcessionaire.getString("Material");
        this.fabricator = dBObjectConcessionaire.getString("fabricator");
        this.quantity = dBObjectConcessionaire.getString("quantity");
        
    }
    
    
    public BasicDBObject dbCarObjectConcessionaire(){
        
        BasicDBObject dbConcessionaire = new BasicDBObject();
        
        dbConcessionaire.append("ID", this.getID());
        dbConcessionaire.append("Material", this.getMaterial());
        dbConcessionaire.append("Fabricator", this.getFabricator());
        dbConcessionaire.append("Quantity", this.getQuantity());
      
        
        return dbConcessionaire;
        
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
     * @return the Material
     */
    public String getMaterial() {
        return Material;
    }

    /**
     * @param Material the Material to set
     */
    public void setMaterial(String Material) {
        this.Material = Material;
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
