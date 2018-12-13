/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.login.LoginDaoCallBack;
import dao.login.LoginDao;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import model.LoginModel;
import model.UserModel;
import view.LoginView;

/**
 *
 * @author macbook
 */
public class LoginController  {
    private LoginView loginView;
    private UserModel userModel ;
    private LoginDaoCallBack loginDaoCallBack;
    
    public LoginController(LoginView loginView){
        this.loginView = loginView;
        initController();
        loginDaoCallBack = new LoginDao();
    } 
    public void initController(){
      loginView.getLoginBtn().addActionListener(e ->loginUser());   
     }  
    private void loginUser(){
        
      userModel = new UserModel();
      userModel.setEmail(loginView.getUserEmailTextField().getText().toString());
      userModel.setPassword(loginView.getUserPasswordTextFiled().getText().toString());
     if( loginDaoCallBack.connexion(userModel)){
         loginView.onGetSucces();
     }else{
         loginView.onGetError("Error");
     }
     
     
    }
    
    
     public class Worker extends SwingWorker<Boolean, Integer>{

            public Worker(){
                //Register a listener to pay attention to the model's status
            }

            @Override
            protected Boolean doInBackground() throws Exception {
                //Call the model, and pass in this swing worker (so the model can publish updates)
                //return model.longRunningProcess(this);
                return false;
            }

            //Expose a method to publish results
            public void publishValue(int i){
                //publish(i);
            }

              @Override
              protected void process(java.util.List<Integer> chunks){
                  //view.progress.setText("Progress:" + chunks.get(chunks.size()-1) + "%");
              }

             @Override
               protected void done() {
                   try {
                      // view.progress.setText("Done");
                   } catch (Exception ignore) {
                   }
               }
        }
    
  
}
