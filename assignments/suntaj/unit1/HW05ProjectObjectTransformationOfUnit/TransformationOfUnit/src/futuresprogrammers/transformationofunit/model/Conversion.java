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
public class Conversion {
   private Float number;
   private Transformation[] transformation;
   private Units[] unit;

       public void  compare() 
       {
       }
       public UnitOfMeasurement addNumber()
       {
           UnitOfMeasurement unitOfMeasurement = new UnitOfMeasurement();
            return unitOfMeasurement ;
       }
       public void createTransformation()
       {
       }
       public Operator enterOperacion ()
       {
           Operator operator = new Operator ();
           return operator;
           
       }

    @Override
    public String toString() {
        return "Conversion{" + "number=" + number + ", transformation=" + transformation + ", unit=" + unit + '}';
    }
       

    /**
     * @return the number
     */
    public Float getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Float number) {
        this.number = number;
    }

    /**
     * @return the transformations
     */
    public Transformation[] getTransformation() {
        return transformation;
    }

    /**
     * @param transformations the transformations to set
     */
    public void setTransformations(Transformation[] transformation) {
        this.transformation = transformation;
    }

    /**
     * @return the unit
     */
    public Units[] getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(Units[] unit) {
        this.unit = unit;
    }
   
   
   
}




