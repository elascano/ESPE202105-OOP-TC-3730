/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contactsbook.controller;

import ec.edu.espe.contactsbook.model.Book;
import ec.edu.espe.contactsbook.model.Contact;
import java.net.UnknownHostException;
import java.util.ArrayList;


/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class ContactController {
    
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public Contact Controller(){
        try{
            Mongo mongo = new Mongo ("localhost",27017);
            DataBase = mongo.getDB("ContactsBook");
            collection = DataBase.getCollection("Contacts");
            System.out.println("successful connection");
        } catch(UnknownHostException ex){
            Logger.getLogger(ContactController.class.getName()).log(Level,SEVERE,null,ex);
            
        }
      
    }
    
    public boolean addContactToBook(String name, Integer number0fFriends, float salary, String email, String book ){
        
       ArrayList<Contact> inventory = new ArrayList();
       inventory.add(new Contact(name,number0fFriends, salay,email, book));
       for(Contact pueC : inventory) {
        collection.insert(pueC.dbContactObjectContactBook());   
       }
     
       return true;
       
    }
}
