/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;



/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class TouristGuide {
    
   private int age;
   private int height ;
   private String skincolor;

    @Override
    public String toString() {
        return "TouristGuide{" + "age=" + age + ", height=" + height + ", skincolor=" + skincolor + '}';
    }
   
   public void salary(){
   }
   public void touristexperience(){    
   }
   public void freetime(){
   }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the skincolor
     */
    public String getSkincolor() {
        return skincolor;
    }

    /**
     * @param skincolor the skincolor to set
     */
    public void setSkincolor(String skincolor) {
        this.skincolor = skincolor;
    }
}
