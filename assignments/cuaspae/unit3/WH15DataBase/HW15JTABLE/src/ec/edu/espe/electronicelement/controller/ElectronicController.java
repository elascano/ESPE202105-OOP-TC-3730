/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.electronicelement.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.electronicelement.model.Electronic;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class ElectronicController {
    
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public ElectronicController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            DataBase = mongo.getDB("Product");
            collection = DataBase.getCollection("Product");
            System.out.println("Connected");
      } catch (UnknownHostException ex) {
            Logger.getLogger(ElectronicController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
    public boolean add(String Product,String Brand,String ID, String Quantity){
        ArrayList<Electronic> materialss = new ArrayList<>();
        materialss.add(new Electronic(Product, Brand, ID,Quantity));
        for (Electronic pueC : materialss){
            collection.insert(pueC.dbMaterialObjectInventory());
            

    }
        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;
        
        

       }
    
}
