/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.material.controller;

import ec.edu.espe.material.model.Material;
import ec.edu.espe.material.view.FrmMaterial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.PersistenceI;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class MaterialController {
  private Material material;
  private FrmMaterial frmMaterial;
  private PersistenceI persistence;

  public void add (Material material){
      // TODO add contact to datebase
      // TODO  call the utils classes
      persistence = new DBManager();
      //TODO convert contact to json;
      String materialJson="{\"name\":\"Alina\"}";
      persistence.create(materialJson, "material");
  }
  
  public ArrayList<Material> find (String email){
    ArrayList<Material> materials = new ArrayList<>();  
    // TODO find the materialas by email using utils
    Material material = new Material ("Alina", "password", "apvillavicencio@espe.edu.ec", "famele", new ArrayList<>(), LocalDateTime.MIN);
    materials.add(material);
    return materials;
  }
  
  public boolean delete (String email){
      boolean deleted =false;
      // TODO
      ArrayList<Material> materials = new ArrayList<>();
      materials = find (email);
      if (materials.size()>0){
          // TODO deleted from data base
          deleted = true;
      }  
      return deleted;
  }
  
   public boolean update (String email){
      boolean update =false;
      // TODO
      ArrayList<Material> materials = new ArrayList<>();
      materials = find (email);
      if (materials.size()>0){
          // TODO deleted from data base
          update = true;
      }  
      return update;
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
