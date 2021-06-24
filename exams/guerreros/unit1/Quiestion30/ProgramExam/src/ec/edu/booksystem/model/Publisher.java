/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.booksystem.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Publisher {
    private int number;
   private  Float year;

    public Publisher(int number, Float year) {
        this.number = number;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Publisher{" + "number=" + number + ", year=" + year + '}';
    }
   
   
    

    /**
     * @return the year
     */
    public Float getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Float year) {
        this.year = year;
    }
    
    

    
}
