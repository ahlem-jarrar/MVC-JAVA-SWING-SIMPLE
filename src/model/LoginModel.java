/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author macbook
 */
public class LoginModel {
    
    private String userName = null;
    private String password = null;
    private String email = null;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public  LoginModel(){
         this.email = "";
         this.password = "";
  
    }
    LoginModel(String email,String password){
        this.email = email;
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public String getPassword()
    {
    return password;
    }
    public void setPassword(String password){
     this.password= password;}
    
    
    
}
