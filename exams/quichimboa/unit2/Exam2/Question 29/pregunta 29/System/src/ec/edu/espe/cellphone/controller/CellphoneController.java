/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphone.controller;

import ec.edu.espe.cellphone.model.Additions;
import ec.edu.espe.cellphone.model.Cellphone;
import ec.edu.espe.cellphone.view.FrmCellphone;
import java.util.ArrayList;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author Andrea Quichimbo InnovaCode ESPE-DCCO
 */
public class CellphoneController {
    private Cellphone cellphone;
    private FrmCellphone frmCellphone;
    private ArrayList<Additions> additions;
    private Persistence dataManager = (Persistence) new DBManager();
    
    public void addCellphone( Cellphone cellphone){
        //TODO read contacts (list) from database
        //TODO add contact to database
        //using the utils class
        
        //TODO contact object to JSON
        String contactJson= "{}";
        dataManager.create(contactJson, "contacts");
    }
    
    public ArrayList<Cellphone> readCellphone(){
        ArrayList<Cellphone> cellphones = new ArrayList<>();
        //TODO read contacts from database
        //TODO use the utils class
       Cellphone cellphone = new Cellphone("Isaac","Escobar","0995239193","iaescobar@espe.edu.ec","sangolqui","client","male","Samsung","S");
       cellphones.add(cellphone);
       cellphone = new Cellphone();
       return cellphones;
   }
    
    boolean removeCellphone(String fullName){
        
        return true;
    }
    
    void uptadeContact(String fullName, Cellphone cellphone){
        
    }

    /**
     * @return the cellphone
     */
    public Cellphone getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(Cellphone cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return the frmCellphone
     */
    public FrmCellphone getFrmCellphone() {
        return frmCellphone;
    }

    /**
     * @param frmCellphone the frmCellphone to set
     */
    public void setFrmCellphone(FrmCellphone frmCellphone) {
        this.frmCellphone = frmCellphone;
    }

    /**
     * @return the additions
     */
    public ArrayList<Additions> getAdditions() {
        return additions;
    }

    /**
     * @param additions the additions to set
     */
    public void setAdditions(ArrayList<Additions> additions) {
        this.additions = additions;
    }
    }
    //ArrayList<Cellphone> findCellphone(String LastName);
    
    //Cellphone findCellphone(String id);
    
    //boolean removeCellphone(String FullName);
    
    //void updateCellphone(String fullName, Cellphone cellphone);
