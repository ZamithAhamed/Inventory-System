/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

/**
 *
 * @author Zamith
 */
public class AirConditioner extends Electronics {
    
    private float capacity;
    
    public AirConditioner(String na, int pr, String br, int vol, float cap){
       // super.ItemID=id;
        super.Name=na;
        super.price=pr;
        super.Brand=br;
        super.Voltage=vol;
        capacity=cap;
        
    }

    /**
     * @return the capacity
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }
    
    
}
