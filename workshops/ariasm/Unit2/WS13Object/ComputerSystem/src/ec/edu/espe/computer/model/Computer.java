/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.computer.model;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class Computer {

    private String processor;
    private int ram;
    private int storage;
    private String refrigeration;
    private String graphiccard;

    public Computer(String processor, int ram, int storage, String refrigeration, String graphicCard) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.refrigeration = refrigeration;
        this.graphiccard = graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" + "processor=" + processor + ", ram=" + ram + ", storage=" + storage + ", refrigeration=" + refrigeration + ", graphiccard=" + graphiccard + '}';
    }

    /**
     * @return the processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @param processor the processor to set
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * @return the refrigeration
     */
    public String getRefrigeration() {
        return refrigeration;
    }

    /**
     * @param refrigeration the refrigeration to set
     */
    public void setRefrigeration(String refrigeration) {
        this.refrigeration = refrigeration;
    }

    /**
     * @return the graphiccard
     */
    public String getGraphiccard() {
        return graphiccard;
    }

    /**
     * @param graphiccard the graphiccard to set
     */
    public void setGraphiccard(String graphiccard) {
        this.graphiccard = graphiccard;
    }

}
