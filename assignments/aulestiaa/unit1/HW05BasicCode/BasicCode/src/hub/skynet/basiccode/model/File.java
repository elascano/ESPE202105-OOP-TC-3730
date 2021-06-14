/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hub.skynet.basiccode.model;

import java.util.ArrayList;



/**
 *
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class File {
    private String name;
    private float size;
    private char typo;
    private ArrayList<Book> books = new ArrayList<>();
    
    public void save(){
        
    }   
    public void analyze(){
        
    }
    public void delete(){
        
    }
    public Book add(Book book){
        Book text = new Book();
        
        return text;
    }

    @Override
    public String toString() {
        return "File{" + "name=" + name + ", size=" + size + ", typo=" + typo + ", books=" + books + '}';
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

    /**
     * @return the typo
     */
    public char getTypo() {
        return typo;
    }

    /**
     * @param typo the typo to set
     */
    public void setTypo(char typo) {
        this.typo = typo;
    }

    /**
     * @return the books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
}
