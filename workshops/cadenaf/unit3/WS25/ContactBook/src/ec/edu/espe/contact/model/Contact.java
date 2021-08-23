/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contact.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Contact {
   private String name; 
   private Integer namberOfFriends; 
   private float salary; 
   private String email; 

    public Contact(String name, Integer namberOfFriends, float salary, String email) {
        this.name = name;
        this.namberOfFriends = namberOfFriends;
        this.salary = salary;
        this.email = email;
    }

    public Contact(String text, Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the namberOfFriends
     */
    public Integer getNamberOfFriends() {
        return namberOfFriends;
    }

    /**
     * @param namberOfFriends the namberOfFriends to set
     */
    public void setNamberOfFriends(Integer namberOfFriends) {
        this.namberOfFriends = namberOfFriends;
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
