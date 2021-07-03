/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arduino.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Arduino {
    
    private String arduinoModel;
    private float workingVoltage;
    private float memory;
    private String microcontroller;
    private int pinsOut;

    public Arduino(String model, float workingVoltage, float memory, String microcontroller, int pinsOut) {
        this.arduinoModel = model;
        this.workingVoltage = workingVoltage;
        this.memory = memory;
        this.microcontroller = microcontroller;
        this.pinsOut = pinsOut;
    }

   

 
    @Override
    public String toString() {
        return "Arduino{" + "ArduinoModel=" + getModel() + ", workingVoltage=" + getWorkingVoltage() + ", memory=" + getMemory() + ", microcontroller=" + getMicrocontroller() + ", pinsOut=" + getPinsOut() + '}';
    }

    /**
     * @return the model
     */
    public String getModel() {
        return arduinoModel;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.arduinoModel = model;
    }

   

    /**
     * @return the memory
     */
    public float getMemory() {
        return memory;
    }

    /**
     * @param memory the memory to set
     */
    public void setMemory(float memory) {
        this.memory = memory;
    }

    /**
     * @return the microcontroller
     */
    public String getMicrocontroller() {
        return microcontroller;
    }

    /**
     * @param microcontroller the microcontroller to set
     */
    public void setMicrocontroller(String microcontroller) {
        this.microcontroller = microcontroller;
    }

    /**
     * @return the pinsOut
     */
    public int getPinsOut() {
        return pinsOut;
    }

    /**
     * @param pinsOut the pinsOut to set
     */
    public void setPinsOut(int pinsOut) {
        this.pinsOut = pinsOut;
    }

    /**
     * @return the workingVoltage
     */
    public float getWorkingVoltage() {
        return workingVoltage;
    }

    /**
     * @param workingVoltage the workingVoltage to set
     */
    public void setWorkingVoltage(float workingVoltage) {
        this.workingVoltage = workingVoltage;
    }
    
    
}
