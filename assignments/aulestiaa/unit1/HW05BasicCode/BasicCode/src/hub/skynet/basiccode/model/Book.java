/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hub.skynet.basiccode.model;

/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class Book {
    private String name;
    private String color;
    private String content;
    private float size;
    
    
    public void read(){
        
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + getName() + ", color=" + getColor() + ", content=" + getContent() + ", size=" + getSize() + '}';
    }
    public void display(){
        
    }
    public void overwrite(){
        
    }
    public void add(){
        
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
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }
}
