/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuretheonaccent.inventory.productos.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Control {
   private Code[] code; 

    @Override
    public String toString() {
        return "Control{" + "code=" + code + '}';
    }

    /**
     * @return the code
     */
    public Code[] getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Code[] code) {
        this.code = code;
    }
       
}
