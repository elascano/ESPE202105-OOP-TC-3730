/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ContactBook.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.ContactBook.model.Book;
import ec.edu.espe.ContactBook.model.Contact;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class ContactController {
    
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public ContactController() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("ContactsBooks");
            collection = DataBase.getCollection("Contacts");
            System.out.println("Welcome - successful connection");
        } catch (UnknownHostException ex) {
            Logger.getLogger(ContactController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public boolean addContactToBook(String name, Integer numberOfFriends, float salary, String email) {

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(name, numberOfFriends, salary, email));

        for (Contact pueC : contacts) {
            collection.insert(pueC.dbContact());
        }

        int input = JOptionPane.showConfirmDialog(null, "Has been successfully registered", "OK", JOptionPane.DEFAULT_OPTION);
        System.out.println(input);

        return true;

    }
}
