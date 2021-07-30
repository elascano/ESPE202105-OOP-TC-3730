/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.controller;

import ec.edu.espe.contacts.model.Activity;
import ec.edu.espe.contacts.model.Client;
import ec.edu.espe.contacts.view.FrmClient;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class ClientController {
    private Client client;
    private FrmClient frmClient;
    
    public void add(Client client){
    //TODO add client to database
    //TODO call the utils clases
    }
    public ArrayList<Client> find(String email){
    ArrayList<Client> clients = new ArrayList<>();
    Client client = new Client("LILIAN", "IZA", "PASSWORD", "0979207979", "WOMAN", new ArrayList<>() , LocalDateTime.MIN, 0);
    clients.add(client);
    return clients;
   }
    
    
    
    public boolean delete(String email){
       boolean delete = false;
       //TODO
       ArrayList<Client> clients = new ArrayList <>();
       clients = find(email);
       if(clients.size()>0){
       //TODO
       delete = true;
     
       }
       return delete;
 
    }
    public ClientController(Client client, FrmClient frmClient) {
        this.client = client;
        this.frmClient = frmClient;
    }

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
     * @return the frmclient
     */
    public FrmClient getFrmClient() {
        return frmClient;
    }

    /**
     * @param frmclient the frmclient to set
     */
    public void setFrmclient(FrmClient frmclient) {
        this.frmClient = frmClient;
    }
    
}
