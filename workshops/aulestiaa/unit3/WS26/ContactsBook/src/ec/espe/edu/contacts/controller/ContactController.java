/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.contacts.controller;

import ec.espe.edu.contacts.model.*;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class ContactController {
    public boolean addContactToBook(Book book, Contact contact){
        
        book.getContacts().add(contact);
        //TODO add to dataBase by calling utils
        return true;
    }
        
}
