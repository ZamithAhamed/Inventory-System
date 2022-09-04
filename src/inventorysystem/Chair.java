/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

/**
 *
 * @author Zamith
 */
public class Chair extends Furniture {
    
    private String type;
    
    public Chair(String na, int pr, String mt, String tr){
       // super.ItemID=id;
        super.Name=na;
        super.price=pr;
        super.Material=mt;
        type=tr;
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

    
}
