/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import javax.swing.JFrame;

/**
 *
 * @author macbook
 */
public class CustomJFrame  extends JFrame{
    
    public CustomJFrame(String title,int width,int heigh){
        this.setTitle(title);
        this.setSize(width, heigh);
        this.setVisible(true);
    }
   
    
    
    
}
