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
import utils.DBManager;
import utils.PersistenceI;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmC0ntact;
    private PersistenceI persistence;

    public void add(Contact contact){ /////////review
        //TODO add contact to database
        //TODO call the utils classes
        persistence = new DBManager();
        //TODO convert contact to json
        String contactJson = "{\"firstname\":\"Erick\"}";
        persistence.create(contactJson, "contacts");
    }
    
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO fin the contact(s) by email using utils
        Contact contact = new Contact("erick", "yanez", "password", "0998283629", "edyanez1@espe.edu.ec", "desciption", "male", new ArrayList<>(), LocalDateTime.MIN, 0);
        contacts.add(contact);
        return contacts;
    }
    
    public boolean delete(String email){
        //TODO
        boolean deleted = false;
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find(email);
        if(contacts.size()>0){
            //TODO delete from database
            deleted = true;
            
        }
        return deleted;
        
        
    }
    
    public boolean update(String email){
        //TODO
        boolean updated = false;
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find(email);
        if(contacts.size()>0){
            //TODO delete from database
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
