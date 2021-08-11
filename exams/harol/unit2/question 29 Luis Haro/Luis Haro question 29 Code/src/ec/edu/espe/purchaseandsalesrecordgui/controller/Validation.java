package ec.edu.espe.purchaseandsalesrecordgui.controller;


/**
 *
 * @author Andrés López
 */
public  class Validation {

    public Validation() {
    }

   
   public boolean validate(String data){ 
    boolean flag = false;
       if(data.length()<8){
           flag = true;
       }
       return flag;
   }
   

}
