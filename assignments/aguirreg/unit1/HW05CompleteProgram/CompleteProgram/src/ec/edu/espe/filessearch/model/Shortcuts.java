/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filessearch.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Shortcuts {
    private Filter[] filtercontents;
    private String keywords;
    private String typefile;
  
    public void FindKeyWords(){
        
    }

    public void UseQuickSearch(){
        
    }
    
    public Contents UseMultimedia(){
    Contents contents = new Contents();
    
    return contents;
    
    }

    @Override
    public String toString() {
        return "Shortcuts{" + "filtercontents=" + filtercontents + ", keywords=" + keywords + ", typefile=" + typefile + '}';
    }

    /**
     * @return the filtercontents
     */
    public Filter[] getFiltercontents() {
        return filtercontents;
    }

    /**
     * @param filtercontents the filtercontents to set
     */
    public void setFiltercontents(Filter[] filtercontents) {
        this.filtercontents = filtercontents;
    }

    /**
     * @return the keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return the typefile
     */
    public String getTypefile() {
        return typefile;
    }

    /**
     * @param typefile the typefile to set
     */
    public void setTypefile(String typefile) {
        this.typefile = typefile;
    }
}
