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
public class Song {
    private String name;
    private String nameAuthor; 
    private int Time;
    private String nameSinger;

    public Song(String name, String nameAuthor, int Time, String nameSinger) {
        this.name = name;
        this.nameAuthor = nameAuthor;
        this.Time = Time;
        this.nameSinger = nameSinger;
    }

    @Override
    public String toString() {
        return "Song{" + "name=" + getName() + ", nameAuthor=" + getNameAuthor() + ", Time=" + getTime() + ", nameSinger=" + getNameSinger() + '}';
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
     * @return the nameAuthor
     */
    public String getNameAuthor() {
        return nameAuthor;
    }

    /**
     * @param nameAuthor the nameAuthor to set
     */
    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    /**
     * @return the Time
     */
    public int getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(int Time) {
        this.Time = Time;
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
