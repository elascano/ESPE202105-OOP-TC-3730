/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.books.model;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
 */
public class Books {
    private String title;
    private String author;
    private String editorial;
    
    
    

    @Override
    public String toString() {
        return "Books{" + "title=" + getTitle() + ", author=" + getAuthor() + ", editorial=" + getEditorial() + '}';
    }
    
    
    

    public Books(String title, String author, String editorial) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
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
 
    
    
  
    
}
    

    

 
  
    
    
