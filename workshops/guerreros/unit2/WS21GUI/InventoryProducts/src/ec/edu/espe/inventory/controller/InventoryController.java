/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventory.controller;

import ec.edu.espe.inventory.model.Inventory;
import ec.edu.espe.inventory.view.FrmInventory;
import java.time.LocalDateTime;
import java.util.ArrayList;




/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class InventoryController {
 
    private Inventory inventory;
    private FrmInventory frmInventory;

    public InventoryController(Inventory inventory, FrmInventory frmInventory) {
        this.inventory = inventory;
        this.frmInventory = frmInventory;
    }
    
    public void add(Inventory product){
       
        
    }
    
 public ArrayList<Inventory> find(int code){
        ArrayList<Inventory> inventorys= new ArrayList<>();
       
        Inventory inventory = new Inventory("Antena","signal reception" , LocalDateTime.MAX,new ArrayList<>(), 123.04F,1234 , 8);
        inventorys.add(inventory);
        return inventorys;
    }
 
 
  public boolean delete(int code){
        //TODO
        boolean deleted = false;
        ArrayList<Inventory> contacts = new ArrayList<>();
        contacts = find(code);
        if(contacts.size()>0){
            //TODO delete from database
            deleted = true;
            
        }
        return deleted;
        
        
    }
    
   public boolean update(int code){
        //TODO
        boolean updated = false;
        ArrayList<Inventory> contacts = new ArrayList<>();
        contacts = find(code);
        if(contacts.size()>0){
            //TODO delete from database
            updated = true;
            
        }
        return updated;
        
        
    }

    /**
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * @return the frmInventory
     */
    public FrmInventory getFrmInventory() {
        return frmInventory;
    }

    /**
     * @param frmInventory the frmInventory to set
     */
    public void setFrmInventory(FrmInventory frmInventory) {
        this.frmInventory = frmInventory;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
