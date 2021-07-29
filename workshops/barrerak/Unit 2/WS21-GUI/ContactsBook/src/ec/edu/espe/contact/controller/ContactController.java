/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contact.controller;

import ec.edu.espe.contact.model.Contact;
import ec.edu.espe.contact.view.FrmContact;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmContact;

    public void add(Contact contact){
        //TODO add contact to datebase
        //TODO call the utils classes
    }
    
    public ArrayList <Contact> find(String email){
        ArrayList<Contact> contacts= new ArrayList<>();
        //TODO find the contact(s)
        Contact contact=new Contact("ed","Kevin","password","09820398","asdd","espe", "asdad",new ArrayList<>(), LocalDateTime.MIN, 0);
        contacts.add(contact);
        return contacts;
        
    }
    public boolean delete(String email){
        boolean deleted= false;
        //TODO
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts= find(email);
        if (contacts.size()>0){
            deleted =true;
        }
        return deleted;
    }
    
      public boolean updated(String email){
        boolean updated= false;
        //TODO
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts= find(email);
        if (contacts.size()>0){
            updated =true;
        }
        return updated;
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
