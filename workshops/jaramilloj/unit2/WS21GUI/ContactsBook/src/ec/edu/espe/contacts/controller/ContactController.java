/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Contact;
import ec.edu.espe.contacts.view.FrmContact;
import java.util.ArrayList;

/**
 *
 * @author Jean Jaramillo
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmContact;
    
    public void add(Contact contact){
        
    }
    
    public ArrayList<Contact> find(String email){
        ArrayList<Contact>contacts = new ArrayList<>();
        
        Contact contact = new Contact("ed", "Jaramillo", "pasword", "0999999", "jcj.espe.edu.ec", "Description", "male", this, contacts, 0);
        contacts.add(contact);
        return contacts;
    }
    
    public boolean delete(String email){
        boolean deleted=false;
        ArrayList<contact> contact = new ArrayList<>();
        if (coontact.size)
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
