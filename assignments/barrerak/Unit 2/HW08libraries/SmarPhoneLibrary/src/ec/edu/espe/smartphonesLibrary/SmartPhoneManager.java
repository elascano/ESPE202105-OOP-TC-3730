/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.smartphonesLibrary;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class SmartPhoneManager {

    int numbeer2;

    public static String sendMessage(String mensaje, int number) {
        int number1;
        String msn;
        int inter, i = 0;
        int[] rest = new int[9];
        inter = number;
        while (inter != 0) {
            rest[i] = inter % 10;
            inter = inter / 10;
            i = i + 1;
        }
        if (i == 9) {
            msn = "the message is rigth...!!!!";
        } else {
            msn = "the message is not right...!!!!";
        }
        return msn;
    }

    public static String call(int number) {
        int number1;
        String msn;
        int inter, i = 0;
        int[] rest = new int[9];
        inter = number;
        while (inter != 0) {
            rest[i] = inter % 10;
            inter = inter / 10;
            i = i + 1;
        }
        if (i == 9) {
            msn = "calling to: 0"+number;
        } else {
            msn = "wrong number";
        }
        return msn;
        
    }
}
