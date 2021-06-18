/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JosselynSigcha.unitTransformation.view;

import JosselynSigcha.unitTransformation.model.Conversion;
import JosselynSigcha.unitTransformation.model.Magnitude;
import JosselynSigcha.unitTransformation.model.Measures;
import JosselynSigcha.unitTransformation.model.Operation;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class UnitTransformation {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello From UnitTransformation " + "Josselyn Sigcha");
        
        Operation operation = new Operation ();
        Magnitude magnitude = new Magnitude ();
        Measures measures = new Measures ();
        Conversion conversion = new Conversion ();
        
        operation.setMultiplication(8.2);
        operation.setDivision(2.2);
        operation.setExponential(3.5);
        operation.setRadical(2.6);
        
        
        magnitude.setValue(2.2);
        magnitude.setLength(8.8);
        magnitude.setQuantity(3.2);
        magnitude.setVolumen(8.2);
        magnitude.setMass(5.4);
        
        
        measures.setSize(5.6);
        measures.setDimension(15.8);
        measures.setExtension(3.80);
        measures.setQuantity(6.1);
        measures.setPortion(4.2);
        
        
        conversion.setUnits(5);
        conversion.setTransformation(8);
        conversion.setChange(6.2);
        conversion.setModification(2);
        
        System.out.println("the value is:"+ operation);
        System.out.println("the magnitude is:"+ magnitude);
        System.out.println("the measure is:"+ measures );
        System.out.println("the conversion is:"+ conversion);
       
            
    }
    
}
