/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.*;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class ContactController {
    public boolean addContactToBook(Book book, Contact contact){
    
        book.getContacts().add(contact);
        //TODO add to DB by calling utils
        
        
        return true;
        
    }
            
}
