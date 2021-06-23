/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.futuresprogrammers.studentdatabase.model;

/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class ID {
   private int number;
   private Students[] student;
   private DataInformations[] datainformation; 
   private String sex ;
   private String civilStatus;
   
   public void indentifyStudent()
   {
       
   }
   
   public void poseNumber()
   {
       
   }
   
   public void dataInformation()
   {
       
   }
   public void detailSex()
   {
       
   }
   public void showCivilStatus ()
   {
       
   }       

    @Override
    public String toString() {
        return "ID{" + "number=" + getNumber() + ", student=" + getStudent() + ", datainformation=" + getDatainformation() + ", sex=" + getSex() + ", civilStatus=" + getCivilStatus() + '}';
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the student
     */
    public Students[] getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Students[] student) {
        this.student = student;
    }

    /**
     * @return the datainformation
     */
    public DataInformations[] getDatainformation() {
        return datainformation;
    }

    /**
     * @param datainformation the datainformation to set
     */
    public void setDatainformation(DataInformations[] datainformation) {
        this.datainformation = datainformation;
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
   
    
   
   
   
  
    
   
    
}
