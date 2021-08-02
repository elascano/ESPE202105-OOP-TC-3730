/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class InputValidation {
    public static boolean validateCharacters(String data){
        boolean isCharacter=false;
        for(int i= 0; i< data.length(); i++){
            char ch = data.charAt(i);
            if(!(ch >= 'a' && ch <= 'z' || ch>= 'A' && ch <= 'Z')){
            isCharacter = false;
        }
        }
       return isCharacter; 
    }
    
}
