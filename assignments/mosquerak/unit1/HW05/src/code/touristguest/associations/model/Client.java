/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.touristguest.associations.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Client {
    private string firstName;
    private string lastName;
    private string moddle;
    private string email;
    private string locate;

    /**
     * @return the firstName
     */
    @Override
    public String toString() {
        return "Client{" + "firstName=" + firstName + ", lastName=" + lastName + ", moddle=" + moddle + ", email=" + email + ", locate=" + locate + '}';
    }

    public string getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(string firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public string getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(string lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the moddle
     */
    public string getModdle() {
        return moddle;
    }

    /**
     * @param moddle the moddle to set
     */
    public void setModdle(string moddle) {
        this.moddle = moddle;
    }

    /**
     * @return the email
     */
    public string getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(string email) {
        this.email = email;
    }

    /**
     * @return the locate
     */
    public string getLocate() {
        return locate;
    }

    /**
     * @param locate the locate to set
     */
    public void setLocate(string locate) {
        this.locate = locate;
    }
}
