/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

/**
 *
 * @author Zamith
 */
public class Table extends Furniture {
    
    private int Drawer;
    
    public Table(String na, int pr, String mt, int dr){
       // super.ItemID=id;
        super.Name=na;
        super.price=pr;
        super.Material=mt;
        Drawer=dr;
    }

    /**
     * @return the Drawer
     */
    public int getDrawer() {
        return Drawer;
    }

    /**
     * @param Drawer the Drawer to set
     */
    public void setDrawer(int Drawer) {
        this.Drawer = Drawer;
    }
    
    
    
}
