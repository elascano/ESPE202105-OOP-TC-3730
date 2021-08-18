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
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmContact;
    private PersistenceI persistence;

    public ContactController(Contact contact, FrmContact aThis) {
        
    }
    
    public void add(Contact contact){
        //TODO add contact to database
        //TODO call utils classes
        persistence = new DBManager();
        //TODO convert contact to json;
        String contactJson = "{\"firstname\":\"Vanessa\"}";
        
    }
    
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO find the contact(s) by email using utils
        Contact contact = new Contact("VK", "Cayambe", "password", "0968436981", "vkcayambe@espe.edu.ec", "description", "female", new ArrayList<Sport>(), LocalDateTime.MIN, 0);
        contacts.add(contact);
        return contacts;
    }
    
    public boolean delete(String email){
        boolean deleted = false;
        //TODO 
         ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find (email);
        if(contacts.size()>0){
            //TODO delete from data base
            deleted = true;
        }
        return deleted;
    }
    
    public boolean update(String email){
        boolean updated = false;
        //TODO 
         ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find (email);
        if(contacts.size()>0){
            updated = true;
        }
        return updated;
    }
    
    @Override
    public String toString() {
        return "ContactController{" + "contact=" + contact + ", frmContact=" + frmContact + '}';
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
