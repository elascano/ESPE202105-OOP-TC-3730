/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

/**
 *
 * @author Erick Yánez ESPE-DCCO
 */
public class Book {

    private int id;
    private String title;
    private String author;
    private String editorial;
    private int yearPublication;

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + ", editorial=" + editorial + ", yearPublication=" + yearPublication + '}';
    }

    public Book() {
    }

    public Book(int id, String title, String author, String editorial, int yearPublication) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.yearPublication = yearPublication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
