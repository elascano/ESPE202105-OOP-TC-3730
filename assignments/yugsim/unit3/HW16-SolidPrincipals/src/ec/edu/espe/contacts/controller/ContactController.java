/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.*;
import ec.edu.espe.contacts.model.Contact;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCC0
 */
public class ContactController {

    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public ContactController() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Contact");
            collection = DataBase.getCollection("Contacts");
            System.out.println("Connected");
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
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);

        // book.getContacts().add(contact);
        //TODO add to DB by calling utils
        return true;

    }

}
