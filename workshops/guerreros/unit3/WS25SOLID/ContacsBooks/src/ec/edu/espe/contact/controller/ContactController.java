/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contact.controller;

import ec.edu.espe.contact.model.Book;
import ec.edu.espe.contact.model.Contact;



/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class ContactController {
    
    public boolean addContacttoBook(Book book, Contact contact){
    
        
        book.getContacts().add(contact);
        //TO DO add to dataBase by calling utils
                
       return true;
       
 
    
    
    }
    
}
