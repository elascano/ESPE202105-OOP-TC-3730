/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.touristguest.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class TouristController {

    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public TouristController(String FistName, String LastName, String Destiny, String Source) {

        try {
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Tourist");
            collection = DataBase.getCollection("User");
            System.out.println("Connected");
        } catch (UnknownHostException ex) {
            Logger.getLogger(TouristController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public TouristController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TouristController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean add(String FistName, String LastName, String Destiny, String Source) {
        ArrayList<TouristController> touristcontrollers = new ArrayList<>();
        touristcontrollers.add(new TouristController(FistName, LastName, Destiny, Source));
        touristcontrollers.forEach((pueC) -> {
            collection.insert(pueC.dbObjectInformation());
        });
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration", "OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);
        return true;

    }

    private DBObject[] dbObjectInformation() {
        return null;
    }
}
