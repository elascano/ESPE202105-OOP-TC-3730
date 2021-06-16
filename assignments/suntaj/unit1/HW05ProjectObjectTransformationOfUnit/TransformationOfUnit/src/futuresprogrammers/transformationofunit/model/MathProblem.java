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
public class MathProblem {
   private Float value;
   private Resolution[] resolutions;
   private Float operate;
   private  int type;
   
   public void solveMathProblem()
   {
       
   }
   public void developedOperation()
   {
       
   }
   public void defineValue()
   {
       
   }

    @Override
    public String toString() {
        return "MathProblem{" + "value=" + value + ", resolutions=" + resolutions + ", operate=" + operate + ", type=" + type + '}';
    }
   

    /**
     * @return the value
     */
    public Float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * @return the resolutions
     */
    public Resolution[] getResolutions() {
        return resolutions;
    }

    /**
     * @param resolutions the resolutions to set
     */
    public void setResolutions(Resolution[] resolutions) {
        this.resolutions = resolutions;
    }

    /**
     * @return the operate
     */
    public Float getOperate() {
        return operate;
    }

    /**
     * @param operate the operate to set
     */
    public void setOperate(Float operate) {
        this.operate = operate;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
    
    
}
