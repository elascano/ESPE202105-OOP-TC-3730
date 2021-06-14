/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Tipe {
    private String name;
    private String format;

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
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Tipe{" + "name=" + name + ", format=" + format + '}';
    }
    
}
