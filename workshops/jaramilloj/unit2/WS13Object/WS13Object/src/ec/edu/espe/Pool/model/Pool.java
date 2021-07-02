/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pool.model;

/**
 *
 * @author Jean Jaramillo
 */
public class Pool {
    
    private String name;
    private String colour;
    private String maker;
    private int depth;
    private int size;

    public Pool() {
    }

    public Pool(String name, String colour, String maker, int depth, int size) {
        this.name = name;
        this.colour = colour;
        this.maker = maker;
        this.depth = depth;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pool{" + "name=" + name + ", colour=" + colour + ", maker=" + maker + ", depth=" + depth + ", size=" + size + '}';
    }
    
}