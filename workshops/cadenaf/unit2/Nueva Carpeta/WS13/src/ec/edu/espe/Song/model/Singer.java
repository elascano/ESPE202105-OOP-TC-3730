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
public class Singer {
    private String nameSinger;

    public Singer(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    @Override
    public String toString() {
        return "Singer{" + "nameSinger=" + getNameSinger() + '}';
    }

    /**
     * @return the nameSinger
     */
    public String getNameSinger() {
        return nameSinger;
    }

    /**
     * @param nameSinger the nameSinger to set
     */
    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }
    
}
