/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.chairfactory;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class ChairData {
     public String files;
      public String creates;
      private float cost;
      private String peso;

    public ChairData(String files, String creates, float cost, String peso) {
        this.files = files;
        this.creates = creates;
        this.cost = cost;
        this.peso = peso;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public String getCreates() {
        return creates;
    }

    public void setCreates(String creates) {
        this.creates = creates;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ChairData{" + "files=" + files + ", creates=" + creates + ", cost=" + cost + ", peso=" + peso + '}';
    }
    
    
    
    
    
}
