/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CodeBook.model;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class Book {
   
    private String title;
    private String author;
    private int instances;
    private int rendered;

    public Book(String title, String author, int instances, int rendered) {
        this.title = title;
        this.author = author;
        this.instances = instances;
        this.rendered = rendered;
    }

    public Book() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", instances=" + instances + ", rendered=" + rendered + '}';
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
         * @return the instances
         */
        public int getInstances() {
            return instances;
        }

        /**
         * @param instances the instances to set
         */
        public void setInstances(int instances) {
            this.instances = instances;
        }

        /**
         * @return the rendered
         */
        public int getRendered() {
            return rendered;
        }

        /**
         * @param rendered the rendered to set
         */
        public void setRendered(int rendered) {
            this.rendered = rendered;
        }

    public String getAutor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getExamples() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTitulo(String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    }

