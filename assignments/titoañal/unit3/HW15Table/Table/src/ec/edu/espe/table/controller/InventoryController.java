/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.table.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import ec.edu.espe.table.model.ElectronicMaterial;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class InventoryController {
    DB dataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public InventoryController(){
        
        try{
            Mongo mongo = new Mongo("localhost", 27017);
            dataBase = mongo.getDB("Inventory");
            collection = dataBase.getCollection("Electronic Material");
            System.out.println("Connected");
      } catch (UnknownHostException ex) {
            Logger.getLogger(InventoryController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    } 
    public boolean add(String Product,String Price,String Fabricator,String Quantity){
        ArrayList<ElectronicMaterial> electronicMaterials = new ArrayList<>();
        electronicMaterials.add(new ElectronicMaterial(Product,Price,Fabricator,Quantity));
        for (ElectronicMaterial pueC : electronicMaterials){
            collection.insert(pueC.dbElectronicMaterialObjectInventory());
            

    }

        int input = JOptionPane.showConfirmDialog(null, "Successful Registration","OK", JOptionPane.DEFAULT_OPTION);
        
        System.out.println(input);
        return true;

}
}