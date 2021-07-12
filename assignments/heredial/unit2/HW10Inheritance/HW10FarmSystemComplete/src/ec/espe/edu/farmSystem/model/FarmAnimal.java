/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farmSystem.model;

import java.util.Calendar;


/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class FarmAnimal {
    
   private int id;
   private String breed;
   public static int day;
   public static int month;
   public static int year;


    public FarmAnimal(int id, String breed, int day, int month, int year) {
        this.id = id;
        this.breed = breed;
        FarmAnimal.day = day;
        FarmAnimal.month = month;
        FarmAnimal.year = year;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", Born On( day=" + day + ", month=" + month + ", year=" + year + ")" +'}';
    
    }   
    
  
        
    
    
    public static int getAgeInMonths(){
        
        
         Calendar bornOn = Calendar.getInstance();
        bornOn.set(year, month-1, day);
        
     
        Calendar actual = Calendar.getInstance();
        
        int differenceYears = calculateYears();
        int months = Math.abs((differenceYears * 12) + (actual.get(Calendar.MONTH)- bornOn.get(Calendar.MONTH)));
        if (actual.get(Calendar.DATE)<day){
            months--;
            
        }
        System.out.println("Get Age In Month-> " + months);
        return months;
    }
    
    
    public static int calculateYears(){
        
        Calendar yearBorn = Calendar.getInstance();
        yearBorn.set(year, month-1 ,day);
        
        Calendar actual = Calendar.getInstance();
        int difference = actual.get(Calendar.YEAR) - yearBorn.get(Calendar.YEAR);
        if (yearBorn.get(Calendar.DAY_OF_YEAR)> actual.get(Calendar.DAY_OF_YEAR)){
            
            difference --;
            
        }
        
        
        return difference;
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
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
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
        FarmAnimal.day = day;
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
        FarmAnimal.month = month;
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
        FarmAnimal.year = year;
    }
   
    
   
   

  

    
    
    
    }

    

    
    

