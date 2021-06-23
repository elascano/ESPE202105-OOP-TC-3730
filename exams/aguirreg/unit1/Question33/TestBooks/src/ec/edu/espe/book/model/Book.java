/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.model;

import org.w3c.dom.css.Counter;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private boolean nolting;
    private int counter;
    
    

    public Book(int id, String name, String author, boolean nolting, int counter) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.nolting = nolting;
        this.counter = counter;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + getId() + ", name=" + getName() + ", author=" + getAuthor() + ", nolting=" + isNolting() + ", Counter=" + getcounter() + '}';
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
     * @return the color
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the nolting
     */
    public boolean isNolting() {
        return nolting;
    }

    /**
     * @param nolting the nolting to set
     */
    public void setNolting(boolean nolting) {
        this.nolting = nolting;
    }

    /**
     * @return the eggCounter
     */
    public int getcounter() {
        return counter;
    }

    /**
     * @param counter the counter to set
     */
    public void setcounter(int counter) {
        this.counter = counter;
    }


   
}