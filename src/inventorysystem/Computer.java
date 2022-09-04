/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

import javax.swing.JTextField;

/**
 *
 * @author Zamith
 */
public class Computer extends Electronics {
    
    private String processor;
    private int RAM;
    
    public Computer(String na, int pr, String br, int vol, String pro, int ram){
       // super.ItemID=id;
        super.Name=na;
        super.price=pr;
        super.Brand=br;
        super.Voltage=vol;
        processor=pro;
        RAM=ram;
    }

    
    /**
     * @return the processor
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * @param processor the processor to set
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    /**
     * @return the RAM
     */
    public int getRAM() {
        return RAM;
    }

    /**
     * @param RAM the RAM to set
     */
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    
}
