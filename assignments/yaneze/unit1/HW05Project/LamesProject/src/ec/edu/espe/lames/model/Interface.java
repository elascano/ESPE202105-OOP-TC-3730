/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.model;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class Interface {
    private String name;
    public Program optionSelected(){
        Program p = new Program();
        return p;
    }

    @Override
    public String toString() {
        return "Interface{" + "name=" + name + '}';
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
    
    
    
}
