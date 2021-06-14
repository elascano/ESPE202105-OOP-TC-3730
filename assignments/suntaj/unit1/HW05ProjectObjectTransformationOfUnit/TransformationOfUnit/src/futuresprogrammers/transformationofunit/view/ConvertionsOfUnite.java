/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuresprogrammers.transformationofunit.view;

import futuresprogrammers.transformationofunit.model.*;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class ConvertionsOfUnite {
    public static void main(String[] args) {
      Conversion conversion = new Conversion();  
      Calculate calculate = new Calculate();
      MathProblem mathProblem = new MathProblem();
      Operator operator = new Operator();
      UnitOfMeasurement unitOfMeasurement = new UnitOfMeasurement();
      Units units = new Units();
      Resolution resolution = new Resolution();
      Transformation transformation = new Transformation();
      Formula formula = new Formula();
      Results results = new Results();
        
        System.out.println("Hello From Conversion Of Unit");
        
        conversion.setNumber(12.5F);
        calculate.setNumber(45.7F);
        mathProblem.setOperate(123.77F);
        mathProblem.setType(3);
        operator.setName("Gabriela");
        unitOfMeasurement.setUnitNmae("meters");
        units.setUnit("mass");
        
        System.out.println("conversion->" + conversion );
        System.out.println("calculate->"+ calculate);
        System.out.println("mathProblem->"+ mathProblem);
        System.out.println("operator->"+ operator);
        System.out.println("unitOfMeasurement->"+ unitOfMeasurement);
        System.out.println("units->"+ units);
        
        
        
        
        
        
    }
    
   
}
