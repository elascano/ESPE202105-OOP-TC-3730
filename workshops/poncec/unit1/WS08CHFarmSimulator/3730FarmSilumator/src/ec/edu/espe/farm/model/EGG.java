/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class EGG 
{
    private int id;

    @Override
    public String toString() {
        return "EGG{" + "id=" + id + '}';
    }
    
    

    public EGG(int id) {
        this.id = id;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
