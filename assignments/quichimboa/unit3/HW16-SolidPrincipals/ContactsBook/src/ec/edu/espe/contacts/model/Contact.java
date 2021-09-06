/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Andrea Quichimbo PROGRAM BUILDER ESPE-DCCO
 */
public class Contact {
    private String name;
    private Integer numberOfFriends;
    private float salary;
    private String email;
    private String book;

    public Contact(String name, Integer numberOfFriends, float salary, String email, String book) {
        this.name = name;
        this.numberOfFriends = numberOfFriends;
        this.salary = salary;
        this.email = email;
        this.book = book;
    }

    
    public Contact(BasicDBObject dbContact) {
        this.name = dbContact.getString("name");
        this.numberOfFriends = dbContact.getInt("numberOfFriends");
        this.salary = dbContact.getLong("salary");
        this.email = dbContact.getString("email");
        this.book = dbContact.getString("Book");
    }
    
    
    public BasicDBObject dbContact(){
        
        BasicDBObject dbContact = new BasicDBObject();
        
        dbContact.append("name", this.getName());
        dbContact.append("numberOfFriends", this.getNumberOfFriends());
        dbContact.append("salary", this.getSalary());
        dbContact.append("email", this.getEmail());
        dbContact.append("Book", this.getBook());
        
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
    public Integer getNumberOfFriends() {
        return numberOfFriends;
    }

    /**
     * @param numberOfFriends the numberOfFriends to set
     */
    public void setNumberOfFriends(Integer numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
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
     * @return the book
     */
    public String getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(String book) {
        this.book = book;
    }
    
   
    
    
}
