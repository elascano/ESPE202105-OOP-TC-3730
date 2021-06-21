/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmComplete.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class BornOnChicken {
       private int day;
   private int month;
   private int year;

    public BornOnChicken(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "BornOnChicken{" + "day=" + getDay() + ", month=" + getMonth() + ", year=" + getYear() + '}';
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
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
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
   
   
    public String[] getArray(){
     String[]inf = {String.valueOf(day),String.valueOf(month),String.valueOf(year)};
        return inf;
   
}
}