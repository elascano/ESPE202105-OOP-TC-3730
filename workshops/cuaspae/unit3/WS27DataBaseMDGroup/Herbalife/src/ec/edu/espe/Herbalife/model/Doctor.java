/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Herbalife.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class Doctor {

    private String name;
    private String email;
    private Integer age;
    private String adress;
    private String specialization;

    public Doctor(String name, String email, int age, String adress, String specialization) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.adress = adress;
        this.specialization = specialization;
    }

    public BasicDBObject dbDataDoctor(){
        
        BasicDBObject dbContacts = new BasicDBObject();
        
        dbContacts.append("Name", this.getName());
        dbContacts.append("Email", this.getEmail());
        dbContacts.append("Age", this.getAge());
        dbContacts.append("Adress", this.getAdress());
        dbContacts.append("Specialization", this.getSpecialization());
    
        return dbContacts;
        
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the specialization
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * @param specialization the specialization to set
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    
}
