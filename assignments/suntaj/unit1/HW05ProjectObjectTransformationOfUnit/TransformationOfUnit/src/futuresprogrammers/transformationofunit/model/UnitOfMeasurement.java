/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuresprogrammers.transformationofunit.model;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class UnitOfMeasurement {
   private  String unitNmae;
   private Float calculation;
   private System systems;
   
   public void searchMeasure()
   {
       
   }
   public void relateUnits()
   {
       
   }

    @Override
    public String toString() {
        return "UnitOfMeasurement{" + "unitNmae=" + unitNmae + ", calculation=" + calculation + ", systems=" + systems + '}';
    }

    /**
     * @return the unitNmae
     */
    public String getUnitNmae() {
        return unitNmae;
    }

    /**
     * @param unitNmae the unitNmae to set
     */
    public void setUnitNmae(String unitNmae) {
        this.unitNmae = unitNmae;
    }

    /**
     * @return the calculation
     */
    public Float getCalculation() {
        return calculation;
    }

    /**
     * @param calculation the calculation to set
     */
    public void setCalculation(Float calculation) {
        this.calculation = calculation;
    }

    /**
     * @return the systems
     */
    public System getSystems() {
        return systems;
    }

    /**
     * @param systems the systems to set
     */
    public void setSystems(System systems) {
        this.systems = systems;
    }
    
}
