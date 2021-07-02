/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.plant.model;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Plant {
    private String name;
    private int type;
    private String typeFruit;
    private String colorFlower;
    private String typeLeaf;

    public Plant(String name, int type, String typeFruit, String colorFlower, String typeLeaf) {
        this.name = name;
        this.type = type;
        this.typeFruit = typeFruit;
        this.colorFlower = colorFlower;
        this.typeLeaf = typeLeaf;
    }

    @Override
    public String toString() {
        return "Plant{" + "name=" + name + ", type=" + type + ", typeFruit=" + typeFruit + ", colorFlower=" + colorFlower + ", typeLeaf=" + typeLeaf + '}';
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
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the typeFruit
     */
    public String getTypeFruit() {
        return typeFruit;
    }

    /**
     * @param typeFruit the typeFruit to set
     */
    public void setTypeFruit(String typeFruit) {
        this.typeFruit = typeFruit;
    }

    /**
     * @return the colorFlower
     */
    public String getColorFlower() {
        return colorFlower;
    }

    /**
     * @param colorFlower the colorFlower to set
     */
    public void setColorFlower(String colorFlower) {
        this.colorFlower = colorFlower;
    }

    /**
     * @return the typeLeaf
     */
    public String getTypeLeaf() {
        return typeLeaf;
    }

    /**
     * @param typeLeaf the typeLeaf to set
     */
    public void setTypeLeaf(String typeLeaf) {
        this.typeLeaf = typeLeaf;
    }

    public char[] toJSONString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
   
    
}
