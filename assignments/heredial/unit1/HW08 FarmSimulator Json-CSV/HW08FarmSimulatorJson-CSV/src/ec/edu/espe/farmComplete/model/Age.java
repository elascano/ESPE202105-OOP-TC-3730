/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmComplete.model;

import java.util.Calendar;



/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Age {
     
    private int day;
    private int month;
    private int year;


    public Age(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

   
    

   public static int calculateDays(int day, int month, int year ){
       
      Calendar cal = Calendar.getInstance();
      
      int actualDay = cal.get(Calendar.DAY_OF_MONTH);
      int dayReal = actualDay - day;
      return dayReal;
   }
   
      public static int calculateMonth(int day, int month, int year ){
       
      Calendar cal = Calendar.getInstance();
      
      int actualMonth = cal.get(Calendar.MONTH);
      int monthReal = actualMonth - month+1;
      return monthReal;
      }
     
      public static int calculateYear(int day, int month, int year ){
       
      Calendar cal = Calendar.getInstance();
      
      int actualYear = cal.get(Calendar.YEAR);
      int yearReal = actualYear - year;
      return yearReal;

    
   
    
    }

    @Override
    public String toString() {
        return "Age{" + "day=" + day + ", month=" + month + ", annun=" + year + '}';
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
        
        String[]birth = {String.valueOf(day),String.valueOf(month),String.valueOf(year)};
        return birth;
       }
    }

