/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmChicken.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Chicken {
    
     private int id;
   private String name;
   private String color;
   private boolean moltying; 
   private int eggCouter ; 

    public Chicken(int id, String name, String color, boolean moltying, int eggCouter) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.moltying = moltying;
        this.eggCouter = eggCouter;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", moltying=" + isMoltying() + ", eggCouter=" + getEggCouter() + '}';
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the moltying
     */
    public boolean isMoltying() {
        return moltying;
    }

    /**
     * @param moltying the moltying to set
     */
    public void setMoltying(boolean moltying) {
        this.moltying = moltying;
    }

    /**
     * @return the eggCouter
     */
    public int getEggCouter() {
        return eggCouter;
    }

    /**
     * @param eggCouter the eggCouter to set
     */
    public void setEggCouter(int eggCouter) {
        this.eggCouter = eggCouter;
    }


 public String[] getArray(){
        
        String[]data = {String.valueOf(id),name,color,String.valueOf(moltying),String.valueOf(eggCouter)};
        return data;
       }

   
    
}
