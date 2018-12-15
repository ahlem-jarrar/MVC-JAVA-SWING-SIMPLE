/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.table.DefaultTableModel;
import model.HomeModel;
import view.AllSessions;
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
    private AllSessions allSessions;

    public HomeController(Home home,HomeModel homeModel) {
        this.home = home ;
        this.homeModel = homeModel;
    }
    public void initController(){
        home.getNewSessionBtn().addActionListener(e->changeConatinerNewSession());
        home.getShowAllBtn().addActionListener(e-> changeConatinerAllSession());
        
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
      private void changeConatinerAllSession(){
        //remove all previous content
        home.getPnaelConatiner().removeAll();
        home.getPnaelConatiner().repaint();
        home.getPnaelConatiner().revalidate();
        
        allSessions = new AllSessions();
        DefaultTableModel defaultModel = new DefaultTableModel();
        AllSessionController allSessionController = new AllSessionController(allSessions,defaultModel);
        allSessionController.initController();
         //add New content
        home.getPnaelConatiner().add(allSessions);
        home.getPnaelConatiner().repaint();
        home.getPnaelConatiner().revalidate();  
    }
    
}
