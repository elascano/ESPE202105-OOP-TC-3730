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
    private int Agency ;
    private int TouristGuide;
    private int Transport;
    private int TravelPackage;
    private  Travels[] travels = new Travels[6];
    private int Products;

    /**
     * @return the Agency
     */
    public int getAgency() {
        return Agency;
    }

    /**
     * @param Agency the Agency to set
     */
    public void setAgency(int Agency) {
        this.Agency = Agency;
    }

    /**
     * @return the TouristGuide
     */
    public int getTouristGuide() {
        return TouristGuide;
    }

    /**
     * @param TouristGuide the TouristGuide to set
     */
    public void setTouristGuide(int TouristGuide) {
        this.TouristGuide = TouristGuide;
    }

    /**
     * @return the Transport
     */
    public int getTransport() {
        return Transport;
    }

    /**
     * @param Transport the Transport to set
     */
    public void setTransport(int Transport) {
        this.Transport = Transport;
    }

    /**
     * @return the TravelPackage
     */
    public int getTravelPackage() {
        return TravelPackage;
    }

    /**
     * @param TravelPackage the TravelPackage to set
     */
    public void setTravelPackage(int TravelPackage) {
        this.TravelPackage = TravelPackage;
    }

    /**
     * @return the travels
     */
    public Travels[] getTravels() {
        return travels;
    }

    /**
     * @param travels the travels to set
     */
    public void setTravels(Travels[] travels) {
        this.travels = travels;
    }

    /**
     * @return the Products
     */
    public int getProducts() {
        return Products;
    }

    /**
     * @param Products the Products to set
     */
    public void setProducts(int Products) {
        this.Products = Products;
    }
    
}
