/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.healthy.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Andrea Quichimbo PROGRAM BUILDER ESPE-DCCO
 */
public class Contact {
    private String name;
    private Integer Age;
    private float ID;
    private String Phone;
    private String speciality;

    public Contact(String name, Integer Age, float ID, String Phone, String speciality) {
        this.name = name;
        this.Age = Age;
        this.ID = ID;
        this.Phone = Phone;
        this.speciality = speciality;
    }

    
    public Contact(BasicDBObject dbContact) {
        this.name = dbContact.getString("name");
        this.Age = dbContact.getInt("Age");
        this.ID = dbContact.getLong("ID");
        this.Phone = dbContact.getString("Phone");
        this.speciality = dbContact.getString("speciality");
    }

    public Contact(String name, Integer Age, String ID, String Phone, String speciality) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public BasicDBObject dbContact(){
        
        BasicDBObject dbContact = new BasicDBObject();
        
        dbContact.append("name", this.getName());
        dbContact.append("age", this.age());
        dbContact.append("ID", this.getID());
        dbContact.append("Phone", this.getPhone());
        dbContact.append("speciality", this.getspeciality());
        
        return dbContact;
        
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
     * @return the numberOfFriends
     */
    public Integer age() {
        return Age;
    }

    /**
     * @param numberOfFriends the numberOfFriends to set
     */
    public void setage(Integer numberOfFriends) {
        this.Age = Age;
    }

    /**
     * @return the salary
     */
    public float getID() {
        return ID;
    }

    /**
     * @param salary the salary to set
     */
    public void setID(float salary) {
        this.ID = ID;
    }

    /**
     * @return the email
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the email to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return the book
     */
    public String getspeciality() {
        return speciality;
    }

    /**
     * @param book the book to set
     */
    public void setspeciality(String speciality) {
        this.speciality = speciality;
    }
    
   
    
    
}
