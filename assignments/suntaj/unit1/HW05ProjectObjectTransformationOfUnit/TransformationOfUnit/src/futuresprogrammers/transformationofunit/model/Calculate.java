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
public class Calculate {
    private Formula[] formula;
    private Float number;
    private Results[] result;

    public void generate()
    {
        
    }
    public void createFormula()
    {
        
    }
    public void designateOperation()
    {
        
    }

    @Override
    public String toString() {
        return "Calculate{" + "formula=" + formula + ", number=" + number + ", result=" + result + '}';
    }
    
    /**
     * @return the formulas
     */
    public Formula[] getFormulas() {
        return formula;
    }

    /**
     * @param formula the formulas to set
     */
    public void setFormula(Formula[] formula) {
        this.formula = formula;
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
     * @return the results
     */
    public Results[] getResult() {
        return result;
    }

    /**
     * @param result the results to set
     */
    public void setResults(Results[] result) {
        this.result = result;
    }
    
}
