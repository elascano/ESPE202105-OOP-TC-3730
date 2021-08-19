/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Contact;
import java.time.LocalDateTime;
import java.util.ArrayList;

import ec.edu.espe.view.FmrContact;
/**
 *
 * @author user
 */
public class ContactController {
    private Contact contact;
    private FmrContact fmrContact;
    private boolean update;
    
    public void add(Contact contact){
        //TODO add contact to database
        //TODO call the utils classes
    }
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO find the contacts by email using utils
        Contact contact = new Contact("email", "lizeth", "password", "190797", "lctaco@espe.edu.ec", "dfg", "sdfs", LocalDateTime.MIN, 0);
        contacts.add(contact);
        return contacts;
                
    }
    
    public boolean delete(String email){
        boolean deleted=false;
        //TODO 
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find(email);
        if (contacts.size()>0){
            deleted = true;
        }
        return update;
    }

    public ContactController(Contact contact, FmrContact fmrContact) {
        this.contact = contact;
        this.fmrContact = fmrContact;
    }

    
    
    
    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @return the frmContact
     */
    public FmrContact getFmrContact() {
        return fmrContact;
    }

    /**
     * @param fmrContact the fmrContact to set
     */
    public void setFrmContact(FmrContact fmrContact) {
        this.fmrContact = fmrContact;
    }
    
    
}
    

