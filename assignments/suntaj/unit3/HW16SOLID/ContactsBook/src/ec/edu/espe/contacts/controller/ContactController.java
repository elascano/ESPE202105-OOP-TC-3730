/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import com.mongodb.*;
import ec.edu.espe.contacts.model.*;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class ContactController {

    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public ContactController() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("ContactsBook");
            collection = DataBase.getCollection("Contacts");
            System.out.println("successful connection");
        } catch (UnknownHostException ex) {
            Logger.getLogger(ContactController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean addContactToBook(String name, Integer numberOfFriends, float salary, String email, String book) {

        ArrayList<Contact> inventory = new ArrayList<>();
        inventory.add(new Contact(name, numberOfFriends, salary, email,book));
        for (Contact pueC : inventory) {
            collection.insert(pueC.dbContactObjectContactBook());

        }

        return true;

    }

}
