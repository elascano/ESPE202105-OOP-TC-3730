/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.books.model;
import java.util.Date;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Books {
    private int year;
    private String title;
    private String editorial;
    private String autor;

    public Books(int year, String title, String editorial, String autor) {
        this.year = year;
        this.title = title;
        this.editorial = editorial;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Books{" + "year=" + year + ", title=" + title + ", editorial=" + editorial + ", autor=" + autor + '}';
    }

    public Books(int i, String the_big_, String string, String paulo_Cohelo, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
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

   
}