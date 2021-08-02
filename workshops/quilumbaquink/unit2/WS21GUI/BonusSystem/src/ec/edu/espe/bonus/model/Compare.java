/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bonus.model;

import java.util.Comparator;

/**
 *
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class Compare implements Comparator<User> 
{

    @Override
    public int compare(User e1, User e2) 
    {
      if(e1.getAge()>e2.getAge())
        {
        return -1; 
        }else if(e1.getAge()>e2.getAge())
        {
        return 0;    
        }else {return 1;}
      
    }
   
}
