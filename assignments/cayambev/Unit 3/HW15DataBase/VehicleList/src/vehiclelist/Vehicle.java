/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclelist;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Vehicle {
    private String Name;
    private String LastName;
    private String ID;
    private String Number;

    public Vehicle(String Name, String LastName, String ID, String Number) {
        this.Name = Name;
        this.LastName = LastName;
        this.ID = ID;
        this.Number = Number;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * @return the Number
     */
    public String getNumber() {
        return Number;
    }

    /**
     * @param Number the Number to set
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }
    
}
