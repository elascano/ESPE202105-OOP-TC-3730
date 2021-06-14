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
public class Operator {
    private String name;
    private MathProblem[ ] mathProblem;
    
    public void enterData()
    {
        
    }
    public void evaluateMathProblem ()
    {
        
    }
    public void remove ()
    {
        
    }

    @Override
    public String toString() {
        return "Operator{" + "name=" + name + ", mathProblem=" + mathProblem + '}';
    }

 
  
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mathProblem
     */
    public MathProblem[] getMathProblem() {
        return mathProblem;
    }

    /**
     * @param mathProblem the mathProblem to set
     */
    public void setMathProblem(MathProblem[] mathProblem) {
        this.mathProblem = mathProblem;
    }
    
    
}
