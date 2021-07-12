/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.farmSystem.model;



/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */

public class Cow extends FarmAnimal{
        
    private boolean isProductMilk;

    public Cow( int id, String breed, int day, int month, int year, boolean isProductMilk) {
        super(id, breed, day, month, year);
        this.isProductMilk = isProductMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString() +"isProductMilk=" + isProductMilk + '}';
    }

  
    
    /**
     * @return the isProductMilk
     */
    public boolean isIsProductMilk() {
        return isProductMilk;
    }

    /**
     * @param isProductMilk the isProductMilk to set
     */
    public void setIsProductMilk(boolean isProductMilk) {
        this.isProductMilk = isProductMilk;
    }

    

  
    
    
     
}
