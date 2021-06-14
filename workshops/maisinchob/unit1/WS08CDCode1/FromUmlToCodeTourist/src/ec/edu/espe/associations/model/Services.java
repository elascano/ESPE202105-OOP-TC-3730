package ec.edu.espe.associations.model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Services {
    private String security ;
    private String servicedescription;

    @Override
    public String toString() {
        return "Services{" + "security=" + security + ", servicedescription=" + servicedescription + '}';
    }
   

    public void customersupport(){
       
    }
    public void lodgings(){
        
    }
    public Client reportaproblem(){
        Client client = new Client();
           return  client;   
    }

    /**
     * @return the security
     */
    public String getSecurity() {
        return security;
    }

    /**
     * @param security the security to set
     */
    public void setSecurity(String security) {
        this.security = security;
    }

    /**
     * @return the servicedescription
     */
    public String getServicedescription() {
        return servicedescription;
    }

    /**
     * @param servicedescription the servicedescription to set
     */
    public void setServicedescription(String servicedescription) {
        this.servicedescription = servicedescription;
    }
}
