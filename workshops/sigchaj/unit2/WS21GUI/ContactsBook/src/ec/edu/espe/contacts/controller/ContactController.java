/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Contact;
import ec.edu.espe.contacts.view.FrmContact;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Josselyn Sigcha Futures Programmers ESPE-DCC0
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmContact;
    private boolean update;
    
    public void add(Contact contact){
        //TODO add contact to database
        //TODO call the utils classes
    }
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO find the contacts by email using utils
        Contact contact = new Contact("email", "josselyn", "password", "0995034007", "jssigcha@espe.edu.ec", "dfg", "sdfs", LocalDateTime.MIN, 0);
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

    public ContactController(Contact contact, FrmContact frmContact) {
        this.contact = contact;
        this.frmContact = frmContact;
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
    public FrmContact getFrmContact() {
        return frmContact;
    }

    /**
     * @param frmContact the frmContact to set
     */
    public void setFrmContact(FrmContact frmContact) {
        this.frmContact = frmContact;
    }
    
    
}