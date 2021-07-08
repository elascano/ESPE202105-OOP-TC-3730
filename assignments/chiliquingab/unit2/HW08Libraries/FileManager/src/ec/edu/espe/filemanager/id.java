/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filemanager;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class id {

    private String id;

    @Override
    public String toString() {
        return "Id{" + " " + id + " } ->";
    }

    public id(String id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
