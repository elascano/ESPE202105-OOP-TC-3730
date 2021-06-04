package ws01structured.programming;
import java.util.Scanner;

public class WS01StructuredProgramming {
    

    public static void main(String[] args) {

        float basic = 0;
        double taxT;
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("WS 05 Structured Programming using Java");
        System.out.println("Heritage");
        System.out.println("Names: Marco Arias, Jennifer Beltrán, Vanessa Cayambe, Victor Coba, Eliana Cuaspa, Stefany Guerrero, Lilian Iza, Kerly Mosquera, Leslie Titoaña, Alexander Pachacama, Josselyn Sigcha, Erick Yánez");
        
        System.out.println("Enter value: ");
        basic = keyboardinput.nextFloat();
        taxT = computeIncometax(basic);
        System.out.println("The heritage is: " + taxT+"$");

    }
    
        public static double computeIncometax(float fBasic) {
        double tax = 0;
        float exceso = 0;

        if (fBasic >= 0 && fBasic <= 71434) {
            tax = 0;
        } else {
            if (fBasic >= 71434 && fBasic <= 142868) {
                tax = 0;
                exceso = fBasic - 71434;
                tax = tax + (exceso * 0.05);
            } else {
                if (fBasic >= 142868 && fBasic <= 285737) {
                    tax = 3572;
                    exceso = fBasic - 142868;
                    tax = tax + (exceso * 0.1);
                } else {
                    if (fBasic >= 285737 && fBasic <= 428635) {
                        tax = 17859;
                        exceso = fBasic - 285737;
                        tax = tax + (exceso * 0.12);
                    } else {
                        if (fBasic >= 428635 && fBasic <= 571523) {
                            tax = 39293;
                            exceso = fBasic - 428635;
                            tax = tax + (exceso * 0.15);
                        } else {
                            if (fBasic >= 571523 && fBasic <= 714391) {
                                tax = 67871;
                                exceso = fBasic - 571523;
                                tax = tax + (exceso * 0.2);
                            } else {
                                if (fBasic >= 714391 && fBasic <= 857240) {
                                    tax = 103588;
                                    exceso = fBasic - 714391;
                                    tax = tax + (exceso * 0.25);
                                } else {
                                    if (fBasic >= 857240 && fBasic <= 857240) {
                                        tax = 146443;
                                        exceso = fBasic - 857240;
                                        tax = tax + (exceso * 0.3);
                                    } else {
                                        if (fBasic >= 857240 ) {
                                            tax = 146443;
                                            exceso = fBasic - 857240;
                                            tax = tax + (exceso * 0.35);
                                        }else{
                                            
                                        }
                                    }

                                }
                            }

                        }
                    }

                }

            }
        }
        return tax;
    }
}