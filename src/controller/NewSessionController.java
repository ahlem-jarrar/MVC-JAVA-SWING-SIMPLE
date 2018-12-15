/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.NewSessionModel;
import view.NewSessionView;

/**
 *
 * @author macbook
 */
public class NewSessionController {
    
    private NewSessionView newSessionView ;
    private NewSessionModel newSessionModel;
   
    public NewSessionController(NewSessionView newSessionView,NewSessionModel newSessionModel) {
        this.newSessionModel = newSessionModel;
        this.newSessionView = newSessionView;
    }
    
    private void initController(){
    
    }
    
    
    
}
