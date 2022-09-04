/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

/**
 *
 * @author Zamith
 */
public class Electronics extends Item{
    
    protected String Brand;
    protected int Voltage;

    /**
     * @return the Brand
     */
    protected String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    protected void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the Voltage
     */
    protected int getVoltage() {
        return Voltage;
    }

    /**
     * @param Voltage the Voltage to set
     */
    protected void setVoltage(int Voltage) {
        this.Voltage = Voltage;
    }
    
    
    
    
}
