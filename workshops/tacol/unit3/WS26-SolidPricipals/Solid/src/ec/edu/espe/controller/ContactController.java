/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Book;
import ec.edu.espe.model.Contact;

/**
 *
 * @author user
 */
public class ContactController {
   
    public boolean addContacttoBook (Book book, Contact contact){
        
        book.getContacts().add(contact);
        //TODOadd to dataBase by calling utils
        
        return true;
     
        
    }
}
