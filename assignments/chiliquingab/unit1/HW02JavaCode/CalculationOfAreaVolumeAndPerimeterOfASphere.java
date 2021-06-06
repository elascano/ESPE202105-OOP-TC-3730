/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation.of.area.volume.and.perimeter.of.a.sphere;

/**
 *
 * @author DELL
 */
public class CalculationOfAreaVolumeAndPerimeterOfASphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pi;
        float radio;
        float diameter;
        float area;
        float volume;
        float perimeter;
        
        diameter=8.9F;
        pi=3.14F;
        radio = 4.5F;
        area=4*pi*radio*radio;
        volume=(4*pi*radio*radio*radio)/3;
        perimeter=pi*diameter;
        
        System.out.printf("Bryan Chiliquinga , HW03: Java Syntax and Netbeans\n");
        System.out.printf("The area of ??the sphere is:: " +area+"\n");
        System.out.printf("The volume of the sphere is: " +volume+"\n");
        System.out.printf("The perimeter of the sphere is:: " +perimeter+"\n");
       
    }
    
}
