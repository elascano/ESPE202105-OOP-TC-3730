/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.model;

import java.util.Date;

/**
 *
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Book {
    private String title;
    private String author;
    private String publisher ;
    private double year;

    public Book(String title, String author, String publisher, double year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", year=" + year + '}';
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
    public double getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(double year) {
        this.year = year;
    }

    
    
}
