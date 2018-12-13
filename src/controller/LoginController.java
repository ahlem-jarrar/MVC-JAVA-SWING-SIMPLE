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
    String email;
    String password ;
    
    public LoginController(LoginView loginView,LoginDao loginDao){
        this.loginView = loginView;
        loginDaoCallBack = loginDao;
        initController();
    } 
    public void initController(){
      loginView.getLoginBtn().addActionListener(e ->loginUser());   
     }  
    private void loginUser(){
      email =   loginView.getUserEmailTextField().getText().toString();
      password = loginView.getUserPasswordTextFiled().getText().toString();
      if(email.isEmpty() || password.isEmpty()){
       JOptionPane.showMessageDialog(loginView, "Veuillez remplir tous les champs");
      }else{
      userModel = new UserModel();
      userModel.setEmail(email);
      userModel.setPassword(password);
     if( loginDaoCallBack.connexion(userModel)){
         loginView.onGetSucces();
         System.out.println("onGetSucces");
     }else{
         loginView.onGetError("Error");
         System.out.println("onGetError");
     }   
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
