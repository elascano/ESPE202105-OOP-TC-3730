/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Ticket {
    private float value;
    private char invoice_code;
    
    public int voucher(int Id_Reportes){
    
    
        return Id_Reportes;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the invoice_code
     */
    public char getInvoice_code() {
        return invoice_code;
    }

    /**
     * @param invoice_code the invoice_code to set
     */
    public void setInvoice_code(char invoice_code) {
        this.invoice_code = invoice_code;
    }
}
