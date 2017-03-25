/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajay
 */
public class Gadget {
    private int gadgetID;
    private double gPrice;
    private String gName;
    
    public Gadget(int gId, double gPrice, String gName){
        this.gadgetID = gId;
        this.gPrice = gPrice;
        this.gName = gName;
    }

    public int getGadgetID() {
        return gadgetID;
    }

    public void setGadgetID(int gadgetID) {
        this.gadgetID = gadgetID;
    }

    public double getgPrice() {
        return gPrice;
    }

    public void setgPrice(double gPrice) {
        this.gPrice = gPrice;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    @Override
    public String toString() {
        return "Gadget{" + "gadgetID=" + gadgetID + ", gPrice=" + gPrice + ", gName=" + gName + '}';
    }
    
    
}
