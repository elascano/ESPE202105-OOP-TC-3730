/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCD
 */
public class Student {
    
    private String name;
    private int age;
    private boolean approved;
    
    public Student(String nam,int ag,boolean appr)
    {
       giveMeName(nam);
       giveMeAge(ag);
       tellMeIfHeApproved(appr);       
    }
    
    public void giveMeName(String nam) 
    {
        name=nam;
    } 
    public void giveMeAge(int ag)
    {
        if(ag>=6 & ag<=12)
        {
        age=ag;
        }
        else
        {
            age=0;
        }
    }
    public void tellMeIfHeApproved(boolean appr)
    {
      if(appr==true)  
      {
          approved=true;
      }
      else
      {
          approved=true;
      }
    }
    public String returnsName()
    {
        return name;
    }
    public int returnsAge()
    {
        return age;
    }
     public boolean itIsApproved()
    {
      return approved;    
    }
             
             
             

}

