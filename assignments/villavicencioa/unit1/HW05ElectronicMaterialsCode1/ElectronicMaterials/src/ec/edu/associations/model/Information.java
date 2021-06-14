/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Information {
    private String characteristicsOfMaterials;
    private float cost;
    private String materialFunction;
    private String colorOfMaterial;

    @Override
    public String toString() {
        return "Information{" + "characteristicsOfMaterials=" + characteristicsOfMaterials + ", cost=" + cost + ", materialFunction=" + materialFunction + ", colorOfMaterial=" + colorOfMaterial + '}';
    }
    
    
public void existingMaterials(){
    
}
public void analyzeCharacteristics(){
    
}

    /**
     * @return the characteristicsOfMaterials
     */
    public String getCharacteristicsOfMaterials() {
        return characteristicsOfMaterials;
    }

    /**
     * @param characteristicsOfMaterials the characteristicsOfMaterials to set
     */
    public void setCharacteristicsOfMaterials(String characteristicsOfMaterials) {
        this.characteristicsOfMaterials = characteristicsOfMaterials;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the materialFunction
     */
    public String getMaterialFunction() {
        return materialFunction;
    }

    /**
     * @param materialFunction the materialFunction to set
     */
    public void setMaterialFunction(String materialFunction) {
        this.materialFunction = materialFunction;
    }

    /**
     * @return the colorOfMaterial
     */
    public String getColorOfMaterial() {
        return colorOfMaterial;
    }

    /**
     * @param colorOfMaterial the colorOfMaterial to set
     */
    public void setColorOfMaterial(String colorOfMaterial) {
        this.colorOfMaterial = colorOfMaterial;
    }
    
}
