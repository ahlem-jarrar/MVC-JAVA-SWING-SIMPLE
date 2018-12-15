/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author macbook
 */
public interface SearchSessionCallBack {
    public void searchTextFieldFocusGained(java.awt.event.FocusEvent evt);                                                                                 
    public void searchTextFieldFocusLost(java.awt.event.FocusEvent evt);                                       
    public  void searchTextFieldKeyReleased(java.awt.event.KeyEvent evt);
}
