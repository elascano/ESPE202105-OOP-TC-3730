//UNIVERSIDAD DE LAS FUERZAR ARMADAS ESPE
//Cuaspa Cuaspud Eliana Aidee
//Programacion orientada a objetos
package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        char option;
            System.out.println("Calculation of areas");
            System.out.println("-------");
            System.out.println("Square area");
            System.out.println("Rectangle area");
            System.out.println("Triangle area");
            System.out.println("Choose an option ");
            option = read.next().charAt(0);           
            double side, base,height;
            switch (option){
                case '1':
                    System.out.print("Enter one side of the square in cm:");
                    side = read.nextDouble();
                    System.out.print("The area of ​​the square is: "+(side + side)+" cm2");                                        
                    break;
                            case '2':
                                System.out.println("Enter the base");
                                base= read.nextDouble(); 
                                System.out.println("Enter the height of the rectangle in cm:");
                                height= read.nextDouble();
                                System.out.println("The area of ​​the regtangle is:"+ (base*height)+"cm2");
                                break;
                                
                                        case '3':
                                        System.out.println("Enter the base of the triangle in cm:");
                                        base=read.nextDouble();
                                        System.out.println("Enter the height of the triangle in cm:");
                                        height=read.nextDouble();
                                        System.out.println("The area of ​​the triangle is:"+ (base*height)/2+"cm2");
                                        break;
                                        default:
                                            System.out.println("Option error");
                                

        }  
    }
}
    

