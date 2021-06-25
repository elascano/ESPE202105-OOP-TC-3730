/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructors.model;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class Files {
    private String name ;
    private String owner ;
    private String size ;
            

    public Files(String name, String owner, String size) {
        this.name = name;
        this.owner = owner;
        this.size = size;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Files{" + "name=" + name + ", owner=" + owner + ", size=" + size + '}';
    }
    
}
