/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

import java.util.ArrayList;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class Type {
    private String name;
    private Final[] es = new Final[5];
    private ArrayList<Final> icon = new ArrayList<>();

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
     * @return the es
     */
    public Final[] getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(Final[] es) {
        this.es = es;
    }

    /**
     * @return the icon
     */
    public ArrayList<Final> getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(ArrayList<Final> icon) {
        this.icon = icon;
    }

}
