/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Provider;
import ec.edu.espe.contacts.model.Product;
import ec.edu.espe.contacts.view.ProviderInvoice;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class ProviderController {
    private Provider invoice;
    private ProviderInvoice frmInvoice;
    private Persistence persistence;

    public void add(Provider invoice){
        //TODO add product to database
        //TODO call the utils classes
        persistence = new DBManager();
        //TODO convert contact to json;
        String providerJson = "{\"name\":\"Carlos\"}";
        persistence.create(providerJson, "provider");
        

    }
    
    public ArrayList<Provider> find(int CI){
        ArrayList<Provider> invoices = new ArrayList<>();
         //TODO find the product using utils
         Provider invoice = new Provider("Luis", "Heredia", "1719289330", "12.5", "2341", "Cash",LocalDateTime.now(),new ArrayList<Product>());
         invoices.add(invoice);
         return invoices;
    }
    
    public boolean delete(int CI){
        //TODO
        boolean deleted = false;
        ArrayList<Provider> invoices = new ArrayList<>();
        invoices =  find(CI);
        if(invoices.size()>0){
            //TODO  delete from database
            deleted = true;
        }
        return deleted;
        
    }
    
    public boolean update(int CI){
        //TODO
        boolean update = false;
        ArrayList<Provider> invoices = new ArrayList<>();
        invoices = find(CI);
        if(invoices.size()>0){
            //TODO delete from data base
            update = true;
        }
        return update;
        
    }

    public ProviderController(Provider invoice, ProviderInvoice frmInvoice) {
        this.invoice = invoice;
        this.frmInvoice = frmInvoice;
    }

    /**
     * @return the invoice
     */
    public Provider getInvoice() {
        return invoice;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(Provider invoice) {
        this.invoice = invoice;
    }

    /**
     * @return the frmInvoice
     */
    public ProviderInvoice getFrmInvoice() {
        return frmInvoice;
    }

    /**
     * @param frmInvoice the frmInvoice to set
     */
    public void setFrmInvoice(ProviderInvoice frmInvoice) {
        this.frmInvoice = frmInvoice;
    }

 
    
    
    
    
    
        
    }
        
    
    
  

    
    
    
    
    

