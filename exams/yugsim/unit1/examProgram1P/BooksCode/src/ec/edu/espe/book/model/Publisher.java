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
public class Publisher {
    private String publisher;

    @Override
    public String toString() {
        return "Publisher{" + "publisher=" + publisher + '}';
    }

    public Publisher(String publisher) {
        this.publisher = publisher;
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
    
}
