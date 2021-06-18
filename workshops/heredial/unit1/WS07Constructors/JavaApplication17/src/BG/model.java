/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BG;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class model {
    private String name;
    private int ID;
    private int phone;
    
    public model(String name, int ID, int phone){
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        
        
    } 

    @Override
    public String toString() {
        return "model{" + "name=" + name + ", ID=" + ID + ", phone=" + phone + '}';
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
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
}
