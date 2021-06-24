/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.model;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class YearOfPublication {
    private int year;

    @Override
    public String toString() {
        return "YearOfPublication{" + "year=" + year + '}';
    }

    public YearOfPublication(int year) {
        this.year = year;
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
