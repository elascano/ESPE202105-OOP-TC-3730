/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filessearch.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Results {
    private NameResult[] nameResult;
    
    public void ShowMultimedia(){
        
    }

    @Override
    public String toString() {
        return "Results{" + "nameResult=" + nameResult + '}';
    }

    /**
     * @return the nameResult
     */
    public NameResult[] getNameResult() {
        return nameResult;
    }

    /**
     * @param nameResult the nameResult to set
     */
    public void setNameResult(NameResult[] nameResult) {
        this.nameResult = nameResult;
    }
}
