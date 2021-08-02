/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dealership.controller;

import ec.edu.espe.dealership.model.Contact;
import ec.edu.espe.dealership.model.Vehicle;
import ec.edu.espe.dealership.view.FrmContact;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.PersistenceI;


/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class ContactController {
   private Contact contact; 
   private FrmContact frmContact; 
   private PersistenceI persistenceI;
    
   public void add(Contact contact){
        //TODO add contact to datebase
        //TODO call the ultils classes
        
        setPersistenceI(new DBManager()); 
        //TODO convert contact to Json; 
        String contactJson= "{\"\firstname\";\"Fernanda\"}";
        getPersistenceI().create(contactJson, "contacts"); 
    }

   
    public ArrayList<Contact> find(String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        //TODO FIND THE CONTACT(S) BY E-MAIL USING UTILS     
        Contact contact = new Contact("Fer", "Cadena", "password", "68549868", "fmcadena@espe.edu.ec", "description", "femenine", new ArrayList<Vehicle>(), LocalDateTime.MIN, 0);
        contacts.add(contact); 
        return contacts; 
    }
    
    
    public boolean delete(String email){
        boolean deleted=false; 
        //
        
        ArrayList<Contact> contacts = new ArrayList<>(); 
        contacts = find(email); 
        if (contacts.size()>0){
            //TODO dele from data base
            deleted = true;
        }
        return deleted; 
    }
    
        public boolean update(String email){
        boolean updated=false; 
        //
        
        ArrayList<Contact> contacts = new ArrayList<>(); 
        contacts = find(email); 
        if (contacts.size()>0){
            //TODO dele from data base
            updated = true;
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

    /**
     * @return the persistenceI
     */
    public PersistenceI getPersistenceI() {
        return persistenceI;
    }

    /**
     * @param persistenceI the persistenceI to set
     */
    public void setPersistenceI(PersistenceI persistenceI) {
        this.persistenceI = persistenceI;
    }

    

}
