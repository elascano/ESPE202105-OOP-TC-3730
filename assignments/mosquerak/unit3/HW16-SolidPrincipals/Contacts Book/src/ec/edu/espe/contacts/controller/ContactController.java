/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Book;
import ec.edu.espe.contacts.model.Contact;



/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class ContactController {
    public boolean addContactToBook(Book book,Contact contact){
       book.getContacts().add(contact);
       // TODO add to database by calling utils
        return true;
    }
    
    
}
