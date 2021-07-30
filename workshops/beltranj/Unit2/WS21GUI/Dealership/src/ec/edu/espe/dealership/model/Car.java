/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dealership.model;
import java.util.ArrayList;
/**
 *
 * @author hecto
 */
public class Car {
    private String firstName;
    private String lastName;
    private String pasword;
    private String brand;
    private String model;
    private ArrayList <Accessory>  accessory ;

    public Car(String firstName, String lastName, String pasword, String brand, String model, ArrayList<Accessory> accessory) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pasword = pasword;
        this.brand = brand;
        this.model = model;
        this.accessory = accessory;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the pasword
     */
    public String getPasword() {
        return pasword;
    }

    /**
     * @param pasword the pasword to set
     */
    public void setPasword(String pasword) {
        this.pasword = pasword;
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the accessory
     */
    public ArrayList <Accessory> getAccessory() {
        return accessory;
    }

    /**
     * @param accessory the accessory to set
     */
    public void setAccessory(ArrayList <Accessory> accessory) {
        this.accessory = accessory;
    }
}
