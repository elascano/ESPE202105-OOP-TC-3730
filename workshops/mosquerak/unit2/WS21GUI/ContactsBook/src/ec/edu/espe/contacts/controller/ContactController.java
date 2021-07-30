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

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class ContactController {
    Contact contact;
    FrmContact frmContact;

    public void add(Contact contact){
        //TODO add contact to datebase
        //TODO call the utils classes
    }
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO find the
        Contact contact = new Contact("Kerly", "Mosquera", "password "," 0961194040","kemosquera1@espe.edu.ec","description", "male", new ArrayList<Sport>,LocalDateTime, int monthIknewThisContact  )
        Contacts.add(contact);
        return contacts;
    }
    
    public boolean delete(String email){
        boolean deleted=false;
        //TODO
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts = find(email);
        if(contacts.size()>0){
            //TODO save from data base
            delete = true;
        }
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
    
}
