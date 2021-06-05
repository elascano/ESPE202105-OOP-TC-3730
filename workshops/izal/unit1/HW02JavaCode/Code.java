package heritagetax;

import java.util.Scanner;


public class Heritagetax {

    
    public static void main(String[] args) {
        //add()
        System.out.println("-------------------------------");
        System.out.println("WELLCOME TO SYSTEM OF HERITAGE");
        System.out.println("-------------------------------");
        int old;
        int id;
        float value;
        String name;
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER YOUR NAME: ");
        name = sc.nextLine();
        System.out.println("ENTER YOUR OLD: ");
        old = sc.nextByte();
        System.out.println("ENTER YOUR ID: ");
        id = sc.nextByte();
        System.out.println("ENTER THE VALUE: ");
        value = sc.nextFloat();
        
         if ((value == 0) &&(value <= 71) ){
             System.out.println(" THE % TAX ON EXCESS FRACTION IS -> 0% ");
             System.out.println(" AMOUNT TO BE PAID IS: $ 0");
                   System.out.println("---------------------------");
                   System.out.println("LILIAN ESTEFANIA IZA GUERRA");
                   System.out.println("W01:StructuredProgramming");
                   System.out.println("___________________________");
            } 
            if ( (value >71) && (value <= 142 ) ){
              System.out.println("THE % TAX ON EXCESS FRACTION IS -> 5%");
              System.out.println(" AMOUNT TO BE PAID IS: $ 0");
                   System.out.println("---------------------------");
                   System.out.println("LILIAN ESTEFANIA IZA GUERRA");
                   System.out.println("W01:StructuredProgramming");
                   System.out.println("___________________________");
              }
               if ( (value >142) && (value <= 285 ) ){
                   System.out.println("THE % TAX ON EXCESS FRACTION IS -> 10%");
                   System.out.println(" AMOUNT TO BE PAID IS: $ 3,572");
                    System.out.println("---------------------------");
                    System.out.println("LILIAN ESTEFANIA IZA GUERRA");
                    System.out.println("W01:StructuredProgramming");
                    System.out.println("___________________________");
               }
                if ( (value >285) && (value <= 428 ) ){
                   System.out.println("THE % TAX ON EXCESS FRACTION IS -> 15%");
                   System.out.println(" AMOUNT TO BE PAID IS: $ 17,859");
                    System.out.println("---------------------------");
                    System.out.println("LILIAN ESTEFANIA IZA GUERRA");
                    System.out.println("W01:StructuredProgramming");
                    System.out.println("___________________________");
                }
                 if ( (value >428) && (value <= 571 ) ){
                   System.out.println("THE % TAX ON EXCESS FRACTION IS -> 20%");
                   System.out.println(" AMOUNT TO BE PAID IS: $ 39,293");
                    System.out.println("---------------------------");
                    System.out.println("LILIAN ESTEFANIA IZA GUERRA");
                    System.out.println("W01:StructuredProgramming");
                    System.out.println("___________________________");
                 }
                   if ( (value >571) && (value <= 714 ) ){
                   System.out.println("THE % TAX ON EXCESS FRACTION IS -> 25%");
                   System.out.println(" AMOUNT TO BE PAID IS: $ 67,871");
                    System.out.println("---------------------------");
                    System.out.println("LILIAN ESTEFANIA IZA GUERRA");
                    System.out.println("W01:StructuredProgramming");
                    System.out.println("___________________________");
                   } 
                    if ( (value >714) && (value <= 857 ) ){
                    System.out.println("THE % TAX ON EXCESS FRACTION IS -> 30%");
                    System.out.println(" AMOUNT TO BE PAID IS: $ 103,588");
                     System.out.println("---------------------------");
                     System.out.println("LILIAN ESTEFANIA IZA GUERRA");
                     System.out.println("W01:StructuredProgramming");
                     System.out.println("___________________________");
                    }
                     if ( (value >857) && (value <= 900 ) ){
                     System.out.println("THE % TAX ON EXCESS FRACTION IS -> 35%");
                     System.out.println(" AMOUNT TO BE PAID IS: $ 146,443");
                      System.out.println("---------------------------");
                      System.out.println("LILIAN ESTEFANIA IZA GUERRA");
                      System.out.println("W01:StructuredProgramming");
                      System.out.println("___________________________");
                     }
                    
                  
          }


    }
    
