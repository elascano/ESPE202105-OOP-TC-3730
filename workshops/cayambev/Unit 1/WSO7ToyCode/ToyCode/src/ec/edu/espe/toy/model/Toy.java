/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.toy.model;
/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Toy {
        private String name;
        private String color;
        private String shape;

    public Toy(String name, String color, String shape) {
        this.name = name;
        this.color = color;
        this.shape = shape;
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
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Toy{" + "name=" + name + ", color=" + color + ", shape=" + shape + '}';
    }
      
}

   

