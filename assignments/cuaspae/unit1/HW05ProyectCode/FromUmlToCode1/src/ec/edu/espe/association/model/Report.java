/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.association.model;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Report {
    private String data;
    private String qualificationOfTheService;
    private String establidhment;
    
    public void inform (){
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the qualificationOfTheService
     */
    public String getQualificationOfTheService() {
        return qualificationOfTheService;
    }

    /**
     * @param qualificationOfTheService the qualificationOfTheService to set
     */
    public void setQualificationOfTheService(String qualificationOfTheService) {
        this.qualificationOfTheService = qualificationOfTheService;
    }

    /**
     * @return the establidhment
     */
    public String getEstablidhment() {
        return establidhment;
    }

    /**
     * @param establidhment the establidhment to set
     */
    public void setEstablidhment(String establidhment) {
        this.establidhment = establidhment;
    }
    
}
