
package ec.edu.espe.gson.model;

public class Chicken {
    private int id;
    private String name;
    private String color; 
    private boolean molting;
    private int eggCounter;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", molting=" + molting() + ", eggCounter=" + getEggCounter() + '}';
    }

    public Chicken(int id, String name, String color, boolean molting, int eggCounter) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.eggCounter = eggCounter;
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
     * @return the Molting
     */
    public boolean molting() {
        return molting;
    }

    /**
     * @param molting the Molting to set
     */
    public void setmolting(boolean molting) {
        this.molting = molting;
    }

    /**
     * @return the eggCounter
     */
    public int getEggCounter() {
        return eggCounter;
    }

    /**
     * @param eggCounter the eggCounter to set
     */
    public void setEggCounter(int eggCounter) {
        this.eggCounter = eggCounter;
    }
    
    public String[] getArray(){
        String[] data = {String.valueOf(id), name, color, String.valueOf(eggCounter), String.valueOf(molting)};
        
        return  data;
   }

}