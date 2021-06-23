/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JosselynSigcha.unitTransformation.model;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class Operation {
    
    private double multiplication;
    private double division;
    private double exponential; 
    private double radical;

    @Override
    public String toString() {
        return "Operation{" + "multiplication=" + multiplication + ", division=" + division + ", exponential=" + exponential + ", radical=" + radical + '}';
    }
    
    
    

    /**
     * @return the multiplication
     */
    public double getMultiplication() {
        return multiplication;
    }

    /**
     * @param multiplication the multiplication to set
     */
    public void setMultiplication(double multiplication) {
        this.multiplication = multiplication;
    }

    /**
     * @return the division
     */
    public double getDivision() {
        return division;
    }

    /**
     * @param division the division to set
     */
    public void setDivision(double division) {
        this.division = division;
    }

    /**
     * @return the exponential
     */
    public double getExponential() {
        return exponential;
    }

    /**
     * @param exponential the exponential to set
     */
    public void setExponential(double exponential) {
        this.exponential = exponential;
    }

    /**
     * @return the radical
     */
    public double getRadical() {
        return radical;
    }

    /**
     * @param radical the radical to set
     */
    public void setRadical(double radical) {
        this.radical = radical;
    }
    
    
    
    
}
