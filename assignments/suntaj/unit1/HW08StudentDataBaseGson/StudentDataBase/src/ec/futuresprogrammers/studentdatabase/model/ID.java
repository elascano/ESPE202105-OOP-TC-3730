/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasestudent.model;

/**
 *
 * @author Josselyn Sigcha Future´s ProgrammersTech ESPE-DCC0
 */
public class ID {
    private String name;
    private int numbersId;
    private String civilStatus;
    private String sex;
    
    
    public void identify()
    {
        
    }
    public void poseNumber()
    {
        
  
    }
    public void specifySex()
    {
        
    }
    public void establisCivilStatus()
    {
        
        
    }

    public ID(String name, int numbersId, String civilStatus, String sex) {
        this.name = name;
        this.numbersId = numbersId;
        this.civilStatus = civilStatus;
        this.sex = sex;
    }
    
    

    @Override
    public String toString() {
        return "ID{" + "name=" + getName() + ", numbersId=" + getNumbersId() + ", civilStatus=" + getCivilStatus() + ", sex=" + getSex() + '}';
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
     * @return the numbersId
     */
    public int getNumbersId() {
        return numbersId;
    }

    /**
     * @param numbersId the numbersId to set
     */
    public void setNumbersId(int numbersId) {
        this.numbersId = numbersId;
    }

    /**
     * @return the civilStatus
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * @param civilStatus the civilStatus to set
     */
    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
   
    


            
    
    
}

