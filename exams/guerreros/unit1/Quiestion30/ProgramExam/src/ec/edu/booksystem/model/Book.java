/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.booksystem.model;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Book {
   private int yearOfPublication;
   private  String author;

    public Book(int yearOfPublication, String author) {
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "yearOfPublication=" + yearOfPublication + ", author=" + author + '}';
    }
   
    

    /**
     * @return the yearOfPublication
     */
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * @param yearOfPublication the yearOfPublication to set
     */
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    
}
