/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.medical.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class Patient {
    private String name;
    private String lastName;
    private Integer age;
    private String gender;
    private String email;
    private String address;
    private Integer phone;

    public Patient(String name, String lastName, Integer age, String gender, String email, String address, Integer phone) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public Patient(BasicDBObject dbPatient) {
        this.name = dbPatient.getString("name");
        this.lastName = dbPatient.getString("lastName");
        this.age = dbPatient.getInt("age");
        this.gender = dbPatient.getString("gender");
        this.email = dbPatient.getString("email");
        this.address = dbPatient.getString("address");
        this.phone = dbPatient.getInt("phone");
    }
    
    public BasicDBObject dbPatient(){
        
        BasicDBObject dbPatient = new BasicDBObject();
        
        dbPatient.append("name", this.getName());
        dbPatient.append("lastName", this.getLastName());
        dbPatient.append("age", this.getAge());
        dbPatient.append("gender", this.getGender());
        dbPatient.append("email", this.getEmail());
        dbPatient.append("address", this.getAddress());
        dbPatient.append("phone", this.getPhone());
        
        
        return dbPatient;
        
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
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    
    
    
    
    
    
}
