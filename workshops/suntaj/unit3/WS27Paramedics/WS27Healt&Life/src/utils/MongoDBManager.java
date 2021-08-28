/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class MongoDBManager implements DBManager {

    DB DataBase;
    DBCollection collection;

    @Override
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

    @Override
    public boolean add(String name, Integer age, Integer id, String gener,
            String direction, int numberOfPhone, String ocupation, String email, float weight, String admissionDate) {

        BasicDBObject document = new BasicDBObject();
        document.put("Name", name);
        document.put("Age", age);
        document.put("Id", id);
        document.put("Gender", gener);
        document.put("Direction", direction);
        document.put("NumberOfPhone", numberOfPhone);
        document.put("Ocupation", ocupation);
        document.put("Email", email);
        document.put("Weigth", weight);
        document.put("Admission Date", admissionDate);
        collection.insert(document);
        
        return true;
    }

}
