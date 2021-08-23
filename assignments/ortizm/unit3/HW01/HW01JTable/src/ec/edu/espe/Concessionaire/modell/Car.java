/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Concessionaire.modell;
import com.mongodb.BasicDBObject;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Car {
    
    private String Brand;
    private String Model;
    private String RegistrationNumber;
    private String Color;

 
      public Car(String Brand, String Model, String RegistrationNumber, String Color) {
        this.Brand = Brand;
        this.Model = Model;
        this.RegistrationNumber = RegistrationNumber;
        this.Color = Color;
    }
    
    public Car(BasicDBObject dBObjectConcessionaire) {
        this.Brand = dBObjectConcessionaire.getString("Brand");
        this.Model =dBObjectConcessionaire.getString("Model");
        this.RegistrationNumber = dBObjectConcessionaire.getString("RegistrationNumber");
        this.Color = dBObjectConcessionaire.getString("Color");
        
    }
    
    
    public BasicDBObject dbCarObjectConcessionaire(){
        
        BasicDBObject dbConcessionaire = new BasicDBObject();
        
        dbConcessionaire.append("ID", this.getBrand());
        dbConcessionaire.append("Name", this.getModel());
        dbConcessionaire.append("Brand", this.getRegistrationNumber());
        dbConcessionaire.append("Purchase Price", this.getColor());
      
        
        return dbConcessionaire;
        
    }

  

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the RegistrationNumber
     */
    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    /**
     * @param RegistrationNumber the RegistrationNumber to set
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }
    
    
    

    
}
