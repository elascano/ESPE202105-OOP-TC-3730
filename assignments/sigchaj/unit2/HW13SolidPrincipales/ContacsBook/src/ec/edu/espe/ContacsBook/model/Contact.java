/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ContacsBook.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Josselyn Susana Sigcha Manosalvas Codes ESPE-DCCO
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
      public Contact(BasicDBObject dBContacts) {
        this.name =dBContacts.getString("Name");
        this.email = dBContacts.getString("Email");
        this.numberOfFriends = dBContacts.getInt("Number Of Friends");
        this.salary = dBContacts.getInt("Salary");
    }
    
    
    public BasicDBObject dbProductObjectInventory(){
        
        BasicDBObject dbContacts = new BasicDBObject();
        
        dbContacts.append("Name", this.getName());
        dbContacts.append("Email", this.getEmail());
        dbContacts.append("Number Of Friends", this.getNumberOfFriends());
        dbContacts.append("Salary", this.getSalary());
    
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
    
    
    
    
    
}
