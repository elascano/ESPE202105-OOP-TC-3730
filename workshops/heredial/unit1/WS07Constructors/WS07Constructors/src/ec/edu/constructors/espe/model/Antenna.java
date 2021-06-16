/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.constructors.espe.model;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Antenna {
    
    private String trademark;
    private String type;
    private int code;
    private boolean isCoding;
    private char model;
    
    public Antenna(String trademark, String type, int code, boolean isCoding, char model){
        
        this.trademark = trademark;
        this.code = code;
        this.type = type;
        this.isCoding = isCoding;
        this.model = model;
        
    }

   
    @Override
    public String toString() {
        return "Antenna{" + "trademark=" + trademark + ", type=" + type + ", code=" + code + ", isCoding=" + isCoding + ", model=" + model + '}';
    }

    /**
     * @return the trademark
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * @param trademark the trademark to set
     */
    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the isCoding
     */
    public boolean isIsCoding() {
        return isCoding;
    }

    /**
     * @param isCoding the isCoding to set
     */
    public void setIsCoding(boolean isCoding) {
        this.isCoding = isCoding;
    }

    /**
     * @return the model
     */
    public char getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(char model) {
        this.model = model;
    }
    
}
