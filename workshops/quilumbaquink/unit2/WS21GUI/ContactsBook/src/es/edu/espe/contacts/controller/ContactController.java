/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.edu.espe.contacts.controller;

import es.edu.espe.contacts.model.Contact;
import es.edu.espe.contacts.model.Sport;
import es.edu.espe.contacts.view.FrmContact;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class ContactController {
    private Contact contact;
    private FrmContact frmContact;
    
    public void add(Contact contact){
        // TODO add contact to databases
        //TODO call the utils classes
    }
    public Contact find(String email){
        ArrayList<Contact> contacts= new ArrayList<>();
        // TODO find the contact(s) by email using utils
        Contact contact=new Contact("ed","lascano","password","0961194040","ed@ed.espe.edu.ec","description","male", new ArrayList<Sport>, LocalDateTime);
        contacts.add(contact);
        return contacts;
        
    }
    public boolean delete(String email){
        boolean deleted=false;
        //TODO 
        ArrayList<Contact> contacts= new ArrayList<>();
        contacts=find(email);
        if(contacts.size()>0){
            //TODO delete from data base
            deleted=true;
        }
        return deleted;
    }

    public ContactController(Contact contract, FrmContact frmContact) {
        this.contact = contract;
        this.frmContact = frmContact;
    }

    

    /**
     * @return the contract
     */
    public Contact getContract() {
        return contact;
    }

    /**
     * @param contract the contract to set
     */
    public void setContract(Contact contract) {
        this.contact = contract;
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
