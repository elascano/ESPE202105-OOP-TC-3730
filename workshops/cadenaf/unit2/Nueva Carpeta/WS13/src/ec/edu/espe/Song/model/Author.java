/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Song.model;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Author {
    private String nameAuthor; 

    public Author(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return "Author{" + "nameAuthor=" + getNameAuthor() + '}';
    }

    /**
     * @return the nameAuthor
     */
    public String getNameAuthor() {
        return nameAuthor;
    }

    /**
     * @param nameAuthor the nameAuthor to set
     */
    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
    
}


