/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ruters.model;

/**
 *
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
public class Connection {
    private String model;
    private final String brandtype;
    private String serie;
    
    public Connection(String model, String brandtype, String serie){
        this.model = model;
        this.brandtype = brandtype;
        this.serie = serie;
    }

    
    
}
