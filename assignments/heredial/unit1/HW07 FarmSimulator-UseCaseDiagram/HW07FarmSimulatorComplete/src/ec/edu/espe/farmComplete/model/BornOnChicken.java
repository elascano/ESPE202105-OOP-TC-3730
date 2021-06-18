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
public class BornOnChicken {
    
    public int day;
    public int month;
    public int annun;
    
     
    @Override
    public String toString() {
        return "BornOnChicken{" + getDay() + "/" + getMonth() + "/" + getAnnun() + '}';
        
        
    }
    public BornOnChicken(int day, int month, int annun) {
        this.day = day;
        this.month = month;
        this.annun = annun;
        
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

    



   
  
    
    
  

    }

  


  