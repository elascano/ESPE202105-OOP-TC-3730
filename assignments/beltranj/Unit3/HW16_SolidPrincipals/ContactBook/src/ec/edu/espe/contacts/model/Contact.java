/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Jennifer Betran
 */
public class Contact {

    private String name;
    private Integer numberOfFriends;
    private float salary;
    private String email;

    public Contact(String name, Integer numberOfFriends, float salary, String email) {
        this.name = name;
        this.numberOfFriends = numberOfFriends;
        this.salary = salary;
        this.email = email;
    }

    public Contact(BasicDBObject dbContact) {
        this.name = dbContact.getString("name");
        this.numberOfFriends = dbContact.getInt("numberOfFriends");
        this.salary = dbContact.getLong("salary");
        this.email = dbContact.getString("email");
    }

    public BasicDBObject dbContact() {

        BasicDBObject dbContact = new BasicDBObject();

        dbContact.append("name", this.getName());
        dbContact.append("numberOfFriends", this.getNumberOfFriends());
        dbContact.append("salary", this.getSalary());
        dbContact.append("email", this.getEmail());
        return dbContact;

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

}
