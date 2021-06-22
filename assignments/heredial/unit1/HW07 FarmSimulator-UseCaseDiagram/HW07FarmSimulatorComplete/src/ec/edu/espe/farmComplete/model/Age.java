/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmComplete.model;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Age {
     
    private int day;
    private int month;
    private int annun;

    private Calendar cal = Calendar.getInstance();
           
         private int actualMonth = cal.get(Calendar.MONTH);
         private int actualYear = cal.get(Calendar.YEAR);
         private int actualDay = cal.get(Calendar.DAY_OF_MONTH);

    public Age(int day, int month, int annun) {
        this.day = day;
        this.month = month;
        this.annun = annun;
    }

    @Override
    public String toString() {
        return "Age{" + "actualMonth=" + (actualMonth - month+1) + ", actualYear=" + (actualYear - annun) + ", actualDay=" + (actualDay - day) + '}';
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
     * @return the annun
     */
    public int getAnnun() {
        return annun;
    }

    /**
     * @param annun the annun to set
     */
    public void setAnnun(int annun) {
        this.annun = annun;
    }

    /**
     * @return the cal
     */
    public Calendar getCal() {
        return cal;
    }

    /**
     * @param cal the cal to set
     */
    public void setCal(Calendar cal) {
        this.cal = cal;
    }

    /**
     * @return the actualMonth
     */
    public int getActualMonth() {
        return actualMonth;
    }

    /**
     * @param actualMonth the actualMonth to set
     */
    public void setActualMonth(int actualMonth) {
        this.actualMonth = actualMonth;
    }

    /**
     * @return the actualYear
     */
    public int getActualYear() {
        return actualYear;
    }

    /**
     * @param actualYear the actualYear to set
     */
    public void setActualYear(int actualYear) {
        this.actualYear = actualYear;
    }

    /**
     * @return the actualDay
     */
    public int getActualDay() {
        return actualDay;
    }

    /**
     * @param actualDay the actualDay to set
     */
    public void setActualDay(int actualDay) {
        this.actualDay = actualDay;
    }
   
        

   
    
    }

    
