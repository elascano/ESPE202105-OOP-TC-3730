/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listbookmongo;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Book {
    
    private String NameofBook;
    private String PublicationName;
    private String Author;
    private String ID;

    public Book(){
        
    }
    public Book(String NameofBook, String PublicationName, String Author, String ID) {
        this.NameofBook = NameofBook;
        this.PublicationName = PublicationName;
        this.Author = Author;
        this.ID = ID;
    }

    /**
     * @return the NameofBook
     */
    public String getNameofBook() {
        return NameofBook;
    }

    /**
     * @param NameofBook the NameofBook to set
     */
    public void setNameofBook(String NameofBook) {
        this.NameofBook = NameofBook;
    }

    /**
     * @return the PublicationName
     */
    public String getPublicationName() {
        return PublicationName;
    }

    /**
     * @param PublicationName the PublicationName to set
     */
    public void setPublicationName(String PublicationName) {
        this.PublicationName = PublicationName;
    }

    /**
     * @return the Author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    
}
