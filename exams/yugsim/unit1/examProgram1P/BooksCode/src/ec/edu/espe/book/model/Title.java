/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.book.model;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class Title {
    private String title;

    @Override
    public String toString() {
        return "Title{" + "title=" + title + '}';
    }

    public Title(String title) {
        this.title = title;
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
}
