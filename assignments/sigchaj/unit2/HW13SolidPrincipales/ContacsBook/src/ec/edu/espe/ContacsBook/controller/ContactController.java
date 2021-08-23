/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ContacsBook.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.ContacsBook.model.Book;
import ec.edu.espe.ContacsBook.model.Contact;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Josselyn Susana Sigcha Manosalvas Codes ESPE-DCCO
 */
public class ContactController {
    
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public ContactController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Contacts");
            collection = DataBase.getCollection("Contact");
            System.out.println("successful connection");
        }catch(UnknownHostException ex){
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);            
        }
    }
    
    
     public boolean add(String name, Integer numberOfFriends, float salary, String email){
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(name, numberOfFriends, 0, email));
        for (Contact pueC : contacts){
            collection.insert(pueC.dbProductObjectInventory());
            
        }
        
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;

       }
     
  
        }
        
    