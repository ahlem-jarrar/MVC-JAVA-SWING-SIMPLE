/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.HomeModel;
import view.Home;
import view.NewSessionView;

/**
 *
 * @author macbook
 */
public class HomeController {
    private Home home;
    private HomeModel homeModel;
    private NewSessionView newSessionView;

    public HomeController(Home home,HomeModel homeModel) {
        this.home = home ;
        this.homeModel = homeModel;
    }
    public void initController(){
        home.getNewSessionBtn().addActionListener(e->changeConatinerNewSession());
        
    }
    private void changeConatinerNewSession(){
        //remove all previous content
        home.getPnaelConatiner().removeAll();
        home.getPnaelConatiner().repaint();
        home.getPnaelConatiner().revalidate();
        
        newSessionView = new NewSessionView();
        
         //add New content
        home.getPnaelConatiner().add(newSessionView);
        home.getPnaelConatiner().repaint();
        home.getPnaelConatiner().revalidate();
        
    }
    
}
