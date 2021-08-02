/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.client.controller;

import ec.edu.espe.client.model.Client;
import ec.edu.espe.client.view.FrmClient;
/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class ClientController {
    private Client client;
    private FrmClient frmClient;

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the frmClient
     */
    public FrmClient getFrmClient() {
        return frmClient;
    }

    /**
     * @param frmClient the frmClient to set
     */
    public void setFrmClient(FrmClient frmClient) {
        this.frmClient = frmClient;
    }
    
    
}
