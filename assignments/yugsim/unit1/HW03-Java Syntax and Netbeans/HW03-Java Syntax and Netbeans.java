/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangular.prism_volume_area_perimeter;

/**
 *
 * @author PERSONAL
 */
public class TriangularPrism_volume_area_perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float triangle_base;
        float triangle_height;
        float base_area;
        float triangular_prism_volume;
        float triangular_prism_height;
        float base_perimeter;
        
        triangle_base = 10.0F;
        triangle_height = 8.66F;
        triangular_prism_height = 15.75F;
        
        System.out.println("Pamela Yugsi , HW03: Java Syntax and Netbeans");
        
        base_area = (triangle_base * triangle_height) / 2;
        System.out.println("The area of the base of the triangular prism is equals to -> " + base_area);
        
        triangular_prism_volume = base_area * triangular_prism_height;
        System.out.println("The volume of the triangular prism is equals to -> " + triangular_prism_volume);
        
        base_perimeter = triangle_base * 3;
        System.out.println("The perimeter of the base of the triangular prism is equals to -> " + base_perimeter);
    }
}
