/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Concessionaire.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import ec.edu.espe.Concessionaire.modell.Car;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class ConcessionaireController {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public ConcessionaireController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Concessionaire");
            collection = DataBase.getCollection("Car");
            System.out.println("Connected");
      } catch (UnknownHostException ex) {
            Logger.getLogger(ConcessionaireController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
    public boolean add(String Brand,String Model,String RegistrationNumber, String Color){
        ArrayList<Car> carss = new ArrayList<>();
        carss.add(new Car(Brand, Model, RegistrationNumber,Color));
        for (Car pueC : carss){
            collection.insert(pueC.dbCarObjectConcessionaire());
            

    }
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;

       }
}


