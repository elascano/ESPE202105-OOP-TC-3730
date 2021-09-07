/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Jean Jaramillo
 */
public class ShellSort implements SortingStrategy {

    private int h;

    @Override
    public int[] sort(int[] data) {
        System.out.println("ordering" + data + ",using shell sort");
        int[] sortedData = data;
        
{
  int i,n = 0,h = 0;
  this.h=0;
  while (h > 0)
  { for (i = h-1; i<n; i++)
    {
       int B = data[i];
       int j = i;
       for (j = i; (j >= h) && (data[j - h] > B); j -= h)
       { data[j] = data[j - h];}
         data[j] = B;
     }
       h = h / 2;
  }
}
        
        return sortedData;

    }

}
