/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.ArrayList;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Book {
    private String title;
    private String autor; 
    private String publisher;
    private int year;

    Book books[] = new Book[10];
    ArrayList<Book> chick = new ArrayList();

    public Book(String title, String autor, String publisher, int year) {
        this.title = title;
        this.autor = autor;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", autor=" + autor + ", publisher=" + publisher + ", year=" + year + '}';
    }

   



    
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
           
                   
       
}
