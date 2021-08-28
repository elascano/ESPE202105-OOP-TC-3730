/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.touristguest.model;
import com.mongodb.BasicDBObject;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Information {

    private String FirstName;
    private String LastName;
    private String Destiny;
    private String Source;

    public Information(String FirstName, String LastName, String Destiny, String Source) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Destiny = Destiny;
        this.Source = Source;
    }
  public BasicDBObject dBObjectInformation(){
        this.FirstName = dBObjectInformation.getString("First Name");
        this.LastName =dBObjectInformation.getString("Last Name");
        this.Destiny = dBObjectInformation.getString("Destiny");
        this.Source = dBObjectInformation.getString("Source");
        
    }
    
    
    public BasicDBObject dbCarObjectInformation(){
        
        BasicDBObject dbInformation = new BasicDBObject();
        
        dbInformation.append("First Name", this.getFirstName());
        dbInformation.append("LastName", this.getLastName());
        dbInformation.append("Destiny", this.getDestiny());
        dbInformation.append("Source", this.getSource());
      
        
        return dbInformation;
        
    }

  
    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
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
     * @return the Destiny
     */
    public String getDestiny() {
        return Destiny;
    }

    /**
     * @param Destiny the Destiny to set
     */
    public void setDestiny(String Destiny) {
        this.Destiny = Destiny;
    }

    /**
     * @return the Source
     */
    public String getSource() {
        return Source;
    }

    /**
     * @param Source the Source to set
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

}
