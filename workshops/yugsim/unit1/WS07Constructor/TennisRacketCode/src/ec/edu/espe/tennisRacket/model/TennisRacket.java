/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tennisRacket.model;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class TennisRacket {
    private String color;
    private String material;
    private String racketModel;

    @Override
    public String toString() {
        return "TennisRacket{" + "color=" + color + ", material=" + material + ", racketModel=" + racketModel + '}';
    }

    public TennisRacket(String color, String material, String racketModel) {
        this.color = color;
        this.material = material;
        this.racketModel = racketModel;
    }
    
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getRacketModel() {
        return racketModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setRacketModel(String racketModel) {
        this.racketModel = racketModel;
    }
    
}
