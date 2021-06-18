
package Square;
import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner entry= new Scanner (System.in);
        double side;
        double area;
        double perimeter;
        System.out.println("Enter side of the square:");
        side= entry.nextDouble();
        area= side*side;
        perimeter= (side*4);
        System.out.println("The area of the square is:" +area);
        System.out.println("The perimeter of the square is:" +perimeter);        
    }
}
