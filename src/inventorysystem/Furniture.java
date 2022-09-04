/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

/**
 *
 * @author Zamith
 */
public class Furniture extends Item{
    
    protected String Material;

    /**
     * @return the Material
     */
    protected String getMaterial() {
        return Material;
    }

    /**
     * @param Material the Material to set
     */
    protected void setMaterial(String Material) {
        this.Material = Material;
    }
    
    
}
