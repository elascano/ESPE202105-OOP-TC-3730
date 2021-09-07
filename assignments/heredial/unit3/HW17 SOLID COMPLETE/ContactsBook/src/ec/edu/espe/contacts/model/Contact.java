/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

import com.mongodb.BasicDBObject;


/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Contact {

    String name;
    Integer numberOfFriends;
    float salary;
    String email;
    String book;

    

    public Contact(String name, Integer numberOfFriends, float salary, String email, String book) {
        this.name = name;
        this.numberOfFriends = numberOfFriends;
        this.salary = salary;
        this.email = email;
        this.book = book;
    }

    public Contact(BasicDBObject dBObjectInventory) {
        this.name = dBObjectInventory.getString("Name");
        this.numberOfFriends = dBObjectInventory.getInt("Number Of Friends");
        this.salary = (float) dBObjectInventory.getDouble("Salary");
        this.email = dBObjectInventory.getString("Email");
        this.book = dBObjectInventory.getString("Book");

    }

    public BasicDBObject dbContactObjectContactBook() {

        BasicDBObject dbContact0bjectContactBook = new BasicDBObject();

        
        dbContact0bjectContactBook.append("Name", this.getName());
        dbContact0bjectContactBook.append("Number Of Friends", this.getNumberOfFriends());
        dbContact0bjectContactBook.append("Salary", this.getSalary());
        dbContact0bjectContactBook.append("Email", this.getEmail());
        dbContact0bjectContactBook.append("Book", this.getBook());
        
     
        return dbContact0bjectContactBook;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(Integer numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

}
