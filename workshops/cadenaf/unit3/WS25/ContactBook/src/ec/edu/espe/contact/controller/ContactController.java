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
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class ContactController {
    
    public boolean addContactToBoock(Book book, Contact contact){
        
        book.getCntacts().add(contact); 
        
        //TODO add to delaBase by eslling utills
        return true; 
        
    } 
    
}
