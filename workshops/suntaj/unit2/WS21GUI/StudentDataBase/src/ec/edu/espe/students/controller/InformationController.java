/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.students.controller;

import Utils.DBManager;
import Utils.PersistenceI;
import ec.edu.espe.students.model.Information;
import ec.edu.espe.students.view.FrmInformation;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class InformationController {
    
    private Information information;
    private FrmInformation frmInformation;
    private PersistenceI persistence;
    
     public InformationController(Information information, FrmInformation frmInformation) {
         this.information = information;
        this.frmInformation = frmInformation;
    }
    
    public void add(Information information){
     
     persistence = new DBManager();  
      
     String InformationJson="";
     
    }
    
 public ArrayList<Information> search(int ID){
        ArrayList<Information> informations = new ArrayList<>();
        
         Information information = new Information("joss", "espe", "civvil", "flor","fem", 12,new ArrayList<>(), LocalDateTime.MIN, 15);
      
        informations.add(information);
        return informations;
    }
 
 
  public boolean delete(int ID){
        //TODO
       boolean deleted = false;
          ArrayList<Information> informations = new ArrayList<>();
          informations = search(ID);
          if(informations.size() >0 ){
          deleted = true;
          }
          
          return deleted;        
        
    }
    
   public boolean update(int code){
        //TODO
        boolean updated = false;
        ArrayList<Information> contacts = new ArrayList<>();
        contacts = search(code);
        if(contacts.size()>0){
            //TODO delete from database
            updated = true;
            
            
        }
        return updated;
        
        
    }

    /**
     * @return the inventory
     */
    
    /**
     * @return the information
     */
    public Information getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(Information information) {
        this.information = information;
    }

    /**
     * @return the frmInformation
     */
    public FrmInformation getFrmInformation() {
        return frmInformation;
    }

    /**
     * @param frmInformation the frmInformation to set
     */
    public void setFrmInformation(FrmInformation frmInformation) {
        this.frmInformation = frmInformation;
    }
    
    
        
    
    
    
    
    
}
