/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.electronic.controller;

import com.sun.javafx.sg.prism.NGPhongMaterial;
import ec.espe.edu.electronic.view.FrmMaterial;
import java.util.ArrayList;

import javafx.scene.paint.Material;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class MaterialController {
    private Material material;
    private FrmMaterial frmMaterial;

    
    public void add(Material material) {
        //TODO add material to database
        //TODO call the utils clases
   
    }
    public ArrayList<Material> find(String email){
    ArrayList<Material> materials = new ArrayList<>();
    Material material = new Material() {
        @Override
        public void impl_updatePG() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public NGPhongMaterial impl_getNGMaterial() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    materials.add(material);
    return materials;
   
            
    }
    
    public boolean delete(String email){
       boolean delete = false;
       //TODO
       ArrayList<Material> materials = new ArrayList<>();
       materials = find(email);
       if(materials.size()>0){
       //TODO
       delete = true;
       }
       return delete;
       
    }

    public MaterialController(Material material, FrmMaterial frmMaterial) {
        this.material = material;
        this.frmMaterial = frmMaterial;
    }
    
    

    /**
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * @return the frmMaterial
     */
    public FrmMaterial getFrmMaterial() {
        return frmMaterial;
    }

    /**
     * @param frmMaterial the frmMaterial to set
     */
    public void setFrmMaterial(FrmMaterial frmMaterial) {
        this.frmMaterial = frmMaterial;
    }

    
    
}
