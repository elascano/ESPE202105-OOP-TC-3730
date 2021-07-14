package ec.edu.espe.arduino.view;

import ec.edu.espe.arduinoFileManager.ArduinoFileManager;
import java.io.IOException;
/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class ArduinoHW {
  public static void main(String[] args) throws IOException {
        
        System.out.println("Arduino Manager LIBRARY: Haro Morales Luis Federico - Heredia Iza Luis Alberto - Iza Guerra Lilian Estefania ");
        
        String arduinoModel = "" ;
        float workingVoltage = 0;
        float memory = 0 ;
        String microcontroller = "" ;
        int pinsOut = 0 ;
        int cont = 0;
       
       ArduinoFileManager.read(arduinoModel , workingVoltage ,  memory , microcontroller , pinsOut);
       
       ArduinoFileManager.search(arduinoModel, workingVoltage, memory, microcontroller, pinsOut);
       
       ArduinoFileManager.display(arduinoModel, workingVoltage, memory, microcontroller, pinsOut);
           
        

    }
    
}
