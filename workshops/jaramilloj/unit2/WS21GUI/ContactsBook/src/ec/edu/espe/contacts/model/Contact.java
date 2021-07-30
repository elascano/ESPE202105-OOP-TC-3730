/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

/**
 *
 * @author Jean Jaramillo
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String passwore;
    private String phoneNumer;
    private String email;
    private String description;
    private String gender;
    private ArayList<Sport> SPORTS;
    private LocalDateTime birthDate;
    private int monthIKnewThisContact;

    private static class ArayList<T> {

        public ArayList() {
        }
    }

    private static class LocalDateTime {

        public LocalDateTime() {
        }
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    public Contact(String firstName, String lastName, String passwore, String phoneNumer, String email, String description, String gender, ArayList<Sport> SPORTS, LocalDateTime birthDate, int monthIKnewThisContact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passwore = passwore;
        this.phoneNumer = phoneNumer;
        this.email = email;
        this.description = description;
        this.gender = gender;
        this.SPORTS = SPORTS;
        this.birthDate = birthDate;
        this.monthIKnewThisContact = monthIKnewThisContact;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the passwore
     */
    public String getPasswore() {
        return passwore;
    }

    /**
     * @param passwore the passwore to set
     */
    public void setPasswore(String passwore) {
        this.passwore = passwore;
    }

    /**
     * @return the phoneNumer
     */
    public String getPhoneNumer() {
        return phoneNumer;
    }

    /**
     * @param phoneNumer the phoneNumer to set
     */
    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return the SPORTS
     */
    public ArayList<Sport> getSPORTS() {
        return SPORTS;
    }

    /**
     * @param SPORTS the SPORTS to set
     */
    public void setSPORTS(ArayList<Sport> SPORTS) {
        this.SPORTS = SPORTS;
    }

    /**
     * @return the birthDate
     */
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the monthIKnewThisContact
     */
    public int getMonthIKnewThisContact() {
        return monthIKnewThisContact;
    }

    /**
     * @param monthIKnewThisContact the monthIKnewThisContact to set
     */
    public void setMonthIKnewThisContact(int monthIKnewThisContact) {
        this.monthIKnewThisContact = monthIKnewThisContact;
    }
}
