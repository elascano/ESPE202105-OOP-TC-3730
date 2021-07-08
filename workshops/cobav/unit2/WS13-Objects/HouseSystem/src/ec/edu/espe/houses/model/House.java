/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.houses.model;

/**
 *
 * @author Victor Coba Beta Software ESPE-DCCD
 */
public class House {
    private String size;
    private String color;
    private String location;
    private int floors;
    private String type;

   

    @Override
    public String toString() {
        return "House{" + "size=" + size + ", color=" + color + ", location=" + location + ", floors=" + floors + ", type=" + type + '}';
    }

    public House(String size, String color, String location, int floors, String type) {
        this.size = size;
        this.color = color;
        this.location = location;
        this.floors = floors;
        this.type = type;
    }

    
   
    
    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
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
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the floors
     */
    public int getFloors() {
        return floors;
    }

    /**
     * @param floors the floors to set
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
}
