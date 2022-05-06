/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class GradientPanel extends JPanel{
    private Color color1, color2;
    int so;
    public GradientPanel(){
        super();
    }
    public GradientPanel(Color color1, Color color2, int so) {
        super();
        this.color1 = color1;
        this.color2 = color2;
        this.so = so;
    }  
    public GradientPanel(Color color1, Color color2) {
        super();
        this.color1 = color1;
        this.color2 = color2;
    }
    //@Override
    //protected void painComponent(Graphics g){
    //    super.paintComponent(g);
    //}
    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }
    
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    
}
