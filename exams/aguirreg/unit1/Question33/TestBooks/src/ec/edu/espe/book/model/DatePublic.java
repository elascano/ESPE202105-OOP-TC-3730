/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class DatePublic {
    
    private int day;
    private int mounth;
    private int year;

    @Override
    public String toString() {
        return "BornOn{" + "day=" + day + ", mounth=" + mounth + ", year=" + year + '}';
    }

    public DatePublic(int day, int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the mounth
     */
    public int getMounth() {
        return mounth;
    }

    /**
     * @param mounth the mounth to set
     */
    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }


    
}
