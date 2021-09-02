/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.doctor.controller;

import ec.edu.espe.doctor.model.Contact;
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
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class DoctorController {

    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public DoctorController() {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Register");
            collection = DataBase.getCollection("Registers");
            System.out.println("Connected");
        } catch (UnknownHostException ex) {
            Logger.getLogger(DoctorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public boolean addContactToSpeciality(String name, Integer Age, float ID, String Phone, String speciality) {

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(name, Age, ID,Phone , speciality));

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
