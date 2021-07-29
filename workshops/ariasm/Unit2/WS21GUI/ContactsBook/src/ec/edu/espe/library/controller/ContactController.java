/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.library.controller;

import ec.edu.espe.library.model.Contact;
import ec.edu.espe.library.model.Sport;
import ec.edu.espe.library.view.FrmContact;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmC0ntact;

    public void add(Contact contact){
        //TODO add contact to database
        //TODO call the utils classes
    }
    
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO find the contacts by email using utils
        Contact contact = new Contact("Ma", "Arias", "password", "098223579", "ma@espe.edu.ec", "description", "male", new ArrayList<Sport>(), LocalDateTime.MIN, 0);
        contacts.add(contact);
        return contacts;
    }
    
    public boolean delete(String email){
        boolean deleted=false;
        //TODO 
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find(email);
        if (contacts.size()>0){
            //TODO delete from data base
            deleted = true;
        }
        return deleted;
    }
    
        public boolean update(String email){
        boolean updated=false;
        //TODO 
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find(email);
        if (contacts.size()>0){
            //TODO delete from data base
            updated = true;
        }
        return updated;
    }
        
    public ContactController(Contact contact, FrmContact frmC0ntact) {
        this.contact = contact;
        this.frmC0ntact = frmC0ntact;
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
     * @return the frmC0ntact
     */
    public FrmContact getFrmC0ntact() {
        return frmC0ntact;
    }

    /**
     * @param frmC0ntact the frmC0ntact to set
     */
    public void setFrmC0ntact(FrmContact frmC0ntact) {
        this.frmC0ntact = frmC0ntact;
    }
    
    
}
