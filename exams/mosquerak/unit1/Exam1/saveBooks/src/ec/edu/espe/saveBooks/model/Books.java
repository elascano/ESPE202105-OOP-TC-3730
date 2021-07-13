/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.saveBooks.model;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class Books { //the name of the class must be singular

    @Override
    public String toString() {
        return "Books{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearPublication=" + yearPublication + '}';
    }

    
    private String title;
    private String author;
    private String publisher;
    private int yearPublication;
    
    public Books( String title, String author String publisher, int yearPublication );
    {
        this.setTitle(getTitle());
        this.setAuthor(getAuthor());
        this.setPublisher(getPublisher());
        this.setYearPublications(get YearPublication());
}

    public Books(String title, String author, String publisher, int yearPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublication = yearPublication;
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
     * @return the yearPublications
     */
    public int getYearPublications() {
        return yearPublication;
    }

    /**
     * @param yearPublications the yearPublications to set
     */
    public void setYearPublications(int yearPublications) {
        this.yearPublication = yearPublication;
    }
    
}
