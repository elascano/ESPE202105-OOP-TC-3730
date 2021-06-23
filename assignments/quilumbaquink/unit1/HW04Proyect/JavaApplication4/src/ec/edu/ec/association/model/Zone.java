/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ec.association.model;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class Zone {
    private String name;
    private int type;
    
    public void group(String name){
        
    }
    public void group(int type ){
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Zone{" + "name=" + name + ", type=" + type + '}';
    }
    
    
}
