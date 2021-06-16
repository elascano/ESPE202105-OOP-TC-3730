/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Concessionaire {
   private String name;
   private int year;
   private boolean isopen;
   
   public Concessionaire(String name, int year, boolean isopen){
    this.name = name;
    this.year = year;
    this.isopen = isopen;
}

   @Override
   public String toString() {
       return "Concessionaire(" + " name=" + name +", year=" + year + ", isopen=" + isopen + ')';
   }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return the open
     */
    public boolean isOpen() {
        return isopen;
    }

    /**
     * @param isopen the open to set
     */
    public void setOpen(boolean isopen) {
        this.isopen = isopen;
    }
}
