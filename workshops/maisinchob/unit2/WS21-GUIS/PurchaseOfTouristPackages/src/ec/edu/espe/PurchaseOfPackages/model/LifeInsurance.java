/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.PurchaseOfPackages.model;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class LifeInsurance {
    private LifeInsurance[] lifeInsurance = new LifeInsurance[4];
    private String medicalAssistance;
    private String lossOfLuggage;
    private String dentalEmergencies;
    private String immigration;
    private String requirements;

    public LifeInsurance(String medicalAssistance, String lossOfLuggage, String dentalEmergencies, String immigration, String requirements) {
        this.medicalAssistance = medicalAssistance;
        this.lossOfLuggage = lossOfLuggage;
        this.dentalEmergencies = dentalEmergencies;
        this.immigration = immigration;
        this.requirements = requirements;
    }

    

    /**
     * @return the lifeInsurance
     */
    public LifeInsurance[] getLifeInsurance() {
        return lifeInsurance;
    }

    /**
     * @param lifeInsurance the lifeInsurance to set
     */
    public void setLifeInsurance(LifeInsurance[] lifeInsurance) {
        this.lifeInsurance = lifeInsurance;
    }

    /**
     * @return the medicalAssistance
     */
    public String getMedicalAssistance() {
        return medicalAssistance;
    }

    /**
     * @param medicalAssistance the medicalAssistance to set
     */
    public void setMedicalAssistance(String medicalAssistance) {
        this.medicalAssistance = medicalAssistance;
    }

    /**
     * @return the lossOfLuggage
     */
    public String getLossOfLuggage() {
        return lossOfLuggage;
    }

    /**
     * @param lossOfLuggage the lossOfLuggage to set
     */
    public void setLossOfLuggage(String lossOfLuggage) {
        this.lossOfLuggage = lossOfLuggage;
    }

    /**
     * @return the dentalEmergencies
     */
    public String getDentalEmergencies() {
        return dentalEmergencies;
    }

    /**
     * @param dentalEmergencies the dentalEmergencies to set
     */
    public void setDentalEmergencies(String dentalEmergencies) {
        this.dentalEmergencies = dentalEmergencies;
    }

    /**
     * @return the immigration
     */
    public String getImmigration() {
        return immigration;
    }

    /**
     * @param immigration the immigration to set
     */
    public void setImmigration(String immigration) {
        this.immigration = immigration;
    }

    /**
     * @return the requirements
     */
    public String getRequirements() {
        return requirements;
    }

    /**
     * @param requirements the requirements to set
     */
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
    
    
}
