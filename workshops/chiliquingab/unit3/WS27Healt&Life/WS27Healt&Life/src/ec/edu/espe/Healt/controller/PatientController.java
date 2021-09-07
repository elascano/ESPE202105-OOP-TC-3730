/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Healt.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBManager;
import utils.MongoDBManager;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class PatientController {

    DB DataBase;
    DBCollection collection;
    DBManager db;

    public boolean connection() {

        BasicDBObject document = new BasicDBObject();

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Healt&Life");
            collection = DataBase.getCollection("MedicalRoom");
            System.out.println("successful connection");
        } catch (UnknownHostException ex) {
            Logger.getLogger(MongoDBManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;

    }

    public void addPatient(String name, Integer age, Integer id, String gener,
            String direction, int numberOfPhone, String ocupation, String email, float weight, String admissionDate) {

        db = new MongoDBManager();
        db.add(name, age, id, gener, direction, numberOfPhone, ocupation, email, weight, admissionDate);
    }

}
