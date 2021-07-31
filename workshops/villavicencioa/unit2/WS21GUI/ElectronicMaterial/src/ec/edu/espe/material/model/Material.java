/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.material.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Material {
   private String firstName;
   private String password;
   private String email;
   private String gender;
   private ArrayList<Product> material ;
   private LocalDateTime DateOfPurchase;

    public Material(String firstName, String password, String email, String gender, ArrayList<Product> material, LocalDateTime DateOfPurchase) {
        this.firstName = firstName;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.material = material;
        this.DateOfPurchase = DateOfPurchase;
    }

    public Material() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the material
     */
    public ArrayList<Product> getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(ArrayList<Product> material) {
        this.material = material;
    }

    /**
     * @return the DateOfPurchase
     */
    public LocalDateTime getDateOfPurchase() {
        return DateOfPurchase;
    }

    /**
     * @param DateOfPurchase the DateOfPurchase to set
     */
    public void setDateOfPurchase(LocalDateTime DateOfPurchase) {
        this.DateOfPurchase = DateOfPurchase;
    }
   

    


   
}
