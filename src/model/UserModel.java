/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ahlem Jarrar
 */
public class UserModel {
    private String userName = null;
    private String name = null;
    private String email = null;
    private String password = null ;

   public UserModel(){
    }
    public UserModel(String userName,String name){
        this.userName = userName;
        this.name = name;
    }
    public String getUserName(){
        return userName;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
  
    
}
