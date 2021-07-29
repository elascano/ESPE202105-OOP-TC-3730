/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.students.controller;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import ec.edu.espe.students.model.Information;
import ec.edu.espe.students.model.Subject;
import ec.edu.espe.students.view.FrmInformation;
import java.awt.List;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class InformationController {
    private Information information;
    private FrmInformation frmInformation;

    public void add(Information information){
        //TODO add information to dtabase
        // T
    }
    
    public ArrayList<Information> search(int ID){
        ArrayList<Information> informations = new ArrayList<>();
        
        Information information = new Information("joss", "espe", "civvil", "flor","fem", 12,new ArrayList<>(), LocalDateTime.MIN, 15);
      
        informations.add(information);
        return informations;
        
        
    }
    
    public boolean deleted(int ID){
          boolean deleted = false;
          ArrayList<Information> informations = new ArrayList<>();
          informations = search(ID);
          if(informations.size() >0 ){
          deleted = true;
          }
          
          return deleted;
          
    }
     
       
            
            
    
    
    public InformationController(Information information, FrmInformation frmInformation) {
        this.information = information;
        this.frmInformation = frmInformation;
    }

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
