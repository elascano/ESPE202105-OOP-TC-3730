/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ContacsBook.controller;

import ec.edu.espe.ContacsBook.model.Book;
import ec.edu.espe.ContacsBook.model.Contact;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class ContactController {
    
    public boolean addContactToBook(Book book, Contact contact){
        
        book.getContacts().add(contact);
        // To do add to databasse by calling utils
        
        
        
        return true;
        
    }
}
