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
import ec.edu.espe.touristguest.model.Information;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.net.UnknownHostException;
import java.util.logging.Logger;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class TouristController {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();

    public TouristController(){

        Mongo mongo = new Mongo("localhost", 27017);
        DataBase = mongo.getDB("Tourist");
        collection = DataBase.getCollection("User");
        System.out.println("Connected");
    } 
    public boolean add(String FistName,String LastName,String Destiny, String Source){
        ArrayList<TouristController> informations = new ArrayList<>();
         informations .add(new Information(FistName, LastName, Destiny , Source));
        for (TouristController pueC :  informations ){
            collection.insert(pueC.dbInformations());
    }
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);

        System.out.println(input);
        return true;

       }
}
