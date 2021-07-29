/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Invoice;import ec.edu.espe.contacts.model.Product;
import ec.edu.espe.contacts.view.FrmInvoice;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class InvoiceController {
    private Invoice invoice;
    private FrmInvoice frmInvoice;

    public void add(Invoice invoice){
        //TODO add product to database
        //TODO call the utils classes
    }
    
    public ArrayList<Invoice> find(int CI){
        ArrayList<Invoice> invoices = new ArrayList<>();
         //TODO find the product using utils
         Invoice invoice = new Invoice("Luis", "Heredia", 1719289330, 12.5F, 2341, LocalDateTime.now(),new ArrayList<Product>());
         invoices.add(invoice);
         return invoices;
    }
    
    public boolean delete(int CI){
        //TODO
        boolean deleted = false;
        ArrayList<Invoice> invoices = new ArrayList<>();
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
        ArrayList<Invoice> invoices = new ArrayList<>();
        invoices = find(CI);
        if(invoices.size()>0){
            //TODO delete from data base
            update = true;
        }
        return update;
        
    }

    public InvoiceController(Invoice invoice, FrmInvoice frmInvoice) {
        this.invoice = invoice;
        this.frmInvoice = frmInvoice;
    }

    /**
     * @return the invoice
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * @param invoice the invoice to set
     */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    /**
     * @return the frmInvoice
     */
    public FrmInvoice getFrmInvoice() {
        return frmInvoice;
    }

    /**
     * @param frmInvoice the frmInvoice to set
     */
    public void setFrmInvoice(FrmInvoice frmInvoice) {
        this.frmInvoice = frmInvoice;
    }

 
    
    
    
    
    
        
    }
        
    
    
  

    
    
    
    
    

