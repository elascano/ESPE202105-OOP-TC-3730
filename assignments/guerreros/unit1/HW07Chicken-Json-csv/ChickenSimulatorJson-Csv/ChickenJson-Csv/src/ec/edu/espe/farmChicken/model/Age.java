/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmChicken.model;

import java.util.Calendar;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Age {
    private int day1;
    private int month1;
    private int annun1;

    @Override
    public String toString() {
        return "Age{" + "day1=" + day1 + ", month1=" + month1 + ", annun1=" + annun1 + '}';
    }
    

    public Age(int day1, int month1, int annun1) {
        this.day1 = day1;
        this.month1 = month1;
        this.annun1 = annun1;
    }
    
    

         public static int calculateDays(int day1, int month1, int annun1 ){
       
      Calendar cal = Calendar.getInstance();
      
      int actualDay = cal.get(Calendar.DAY_OF_MONTH);
      int dayReal = actualDay - day1;
      return dayReal;
   }
   
      public static int calculateMonth(int day1, int month1, int annun1 ){
       
      Calendar cal = Calendar.getInstance();
      
      int actualMonth = cal.get(Calendar.MONTH);
      int monthReal = actualMonth - month1+1;
      return monthReal;
      }
     
      public static int calculateYear(int day1, int month1, int annun1 ){
       
      Calendar cal = Calendar.getInstance();
      
      int actualYear = cal.get(Calendar.YEAR);
      int yearReal = actualYear - annun1;
      return yearReal;
      }

    /**
     * @return the day1
     */
    public int getDay1() {
        return day1;
    }

    /**
     * @param day1 the day1 to set
     */
    public void setDay1(int day1) {
        this.day1 = day1;
    }

    /**
     * @return the month1
     */
    public int getMonth1() {
        return month1;
    }

    /**
     * @param month1 the month1 to set
     */
    public void setMonth1(int month1) {
        this.month1 = month1;
    }

    /**
     * @return the annun1
     */
    public int getAnnun1() {
        return annun1;
    }

    /**
     * @param annun1 the annun1 to set
     */
    public void setAnnun1(int annun1) {
        this.annun1 = annun1;
    }
    public String[] getArray(){
        
        String[]date = {String.valueOf(day1),String.valueOf(month1),String.valueOf(annun1)};
        return date;
       }
}