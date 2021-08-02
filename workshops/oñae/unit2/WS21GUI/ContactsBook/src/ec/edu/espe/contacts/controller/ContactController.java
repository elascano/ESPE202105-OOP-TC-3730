/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Contact;
import ec.edu.espe.contacts.model.Sport;
import ec.edu.espe.contacts.view.FrmContact;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.PersistenceI;

/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmContact;
    private PersistenceI persistence;

    public void add(Contact contact){
        //TODO add contact to datebase
        //TODO call the utils classes
        setPersistence(new DBManager());
        //TODO convert contact to json;
        String contacJson="{\"firstname\";\"Erick\"}";
        getPersistence().create(contacJson, "contacts");
    }
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO find the contact(s) by email using utils
        Contact contact = new Contact("erick", "ona", "password "," 0998262417","efona1@.espe.edu.ec","description", "male", new ArrayList<Sport>(),LocalDateTime.MIN,0);
        contacts.add(contact);
        return contacts;
    }
    
    public boolean deleted(String email){
        boolean deleted=false;
        //TODO
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find(email);
        if(contacts.size()>0){
            //TODO save from data base
            deleted = true;
        }
        return deleted;
    }
    
    public boolean Updated(String email){
        boolean updated=false;
        //TODO
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find(email);
        if(contacts.size()>0){
            //TODO save from data base
            updated = true;
        }
        return updated;
    }
    
    
    
    public ContactController(Contact contact, FrmContact frmContact) {
        this.contact = contact;
        this.frmContact = frmContact;
    }

    public Contact getContact() {
        return contact;
    }

    public FrmContact getFrmContact() {
        return frmContact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public void setFrmContact(FrmContact frmContact) {
        this.frmContact = frmContact;
    }

    /**
     * @return the persistence
     */
    public PersistenceI getPersistence() {
        return persistence;
    }

    /**
     * @param persistence the persistence to set
     */
    public void setPersistence(PersistenceI persistence) {
        this.persistence = persistence;
    }
    
}
