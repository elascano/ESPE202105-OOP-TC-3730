/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Song.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class NameOfSong {
    private String name;

    public NameOfSong(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NameOfSong{" + "name=" + getName() + '}';
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
