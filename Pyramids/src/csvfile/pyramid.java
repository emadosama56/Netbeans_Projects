/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfile;

/**
 *
 * @author Emad Osama
 */
public class pyramid {
    private String Pharaoh;
    private double Height;
    private String Site;
    private int num;

    pyramid(String Pharaoh, double Height, String Site , int num){
       this.Pharaoh = Pharaoh;
       this.Height = Height;
       this.Site = Site;
       this.num = num;
    }

    public String getPharaoh() {
       return Pharaoh;
    }

    public void setPharaoh(String Pharaoh) {
       this.Pharaoh = Pharaoh;
    }

    public double getHeight() {
       return Height;
    }

    public void setHeight(double Height) {
       this.Height = Height;
    }
    
     public String getSite() {
       return Site;
    }

    public void setSite(String Site) {
       this.Site = Site;
    }
    
    public int getNum() {
       return num;
    }

    public void setNum(int num) {
       this.num = num;
    }

    @Override
    public String toString() {
        return "pyramid{" + "Pharaoh=" + Pharaoh + ", Height=" + Height + ", Site=" + Site + ", num=" + num + '}';
    }
    
}