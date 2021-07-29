/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.contacts.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Book {
    private String title;
    private String author;
    private String code;
    private boolean status;  
    private LocalDateTime UsedDay;
    private ArrayList<Gender> gender;

    public Book(String title, String author, String code, boolean status, LocalDateTime UsedDay, ArrayList<Gender> gender) {
        this.title = title;
        this.author = author;
        this.code = code;
        this.status = status;
        this.UsedDay = UsedDay;
        this.gender = gender;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
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
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the UsedDay
     */
    public LocalDateTime getUsedDay() {
        return UsedDay;
    }

    /**
     * @param UsedDay the UsedDay to set
     */
    public void setUsedDay(LocalDateTime UsedDay) {
        this.UsedDay = UsedDay;
    }

    /**
     * @return the gender
     */
    public ArrayList<Gender> getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(ArrayList<Gender> gender) {
        this.gender = gender;
    }

}
