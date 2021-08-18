/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.workshop.model;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class Contact {

    private String contact;
    private String email;
    private String address;
    private int phoneNumber;

    public Contact() {
    }

    public Contact(String contact, String email, String address, int phoneNumber) {
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "contact=" + contact + ", email=" + email + ", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    }
    
    
   
}
