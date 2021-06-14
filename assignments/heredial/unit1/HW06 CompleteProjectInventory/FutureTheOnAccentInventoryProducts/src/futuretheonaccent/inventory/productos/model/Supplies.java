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
public class Supplies {
    
    private String name;
    private int model;
    private Quality[] quality;
    private Code[] code;
    private String color;
    
    
    public void seeCharacteristcs(){
        
    }
    public seeModel(int model){
        
        
    }
    public Warehouse sendWarehouse(){
        
        Warehouse warehouse = new Warehouse();
        
        return warehouse;
        
    }
    public void reportPrice(){
        
    }

    @Override
    public String toString() {
        return "Supplies{" + "name=" + name + ", model=" + model + ", quality=" + quality + ", code=" + code + ", color=" + color + '}';
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the model
     */
    public int getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(int model) {
        this.model = model;
    }

    /**
     * @return the quality
     */
    public Quality[] getQuality() {
        return quality;
    }

    /**
     * @param quality the quality to set
     */
    public void setQuality(Quality[] quality) {
        this.quality = quality;
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

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}


