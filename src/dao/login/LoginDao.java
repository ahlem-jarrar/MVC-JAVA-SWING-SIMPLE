/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.login;

import dao.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.UserModel;

/**
 *
 * @author macbook
 */
public class LoginDao  implements LoginDaoCallBack{
     
    @Override
    public boolean connexion(UserModel user) {
        boolean isValidUser = false;
        try{
          Statement statement = Connexion.getConnection().createStatement();

         String sql = "Select * from user where email="+'"'+user.getEmail()+'"'+" and password="+'"'+user.getPassword()+'"';
         System.out.println(sql);
         ResultSet result = statement.executeQuery(sql);
         if(result.next()) {
             isValidUser = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
       return isValidUser;
    }

    @Override
    public void createUser(UserModel user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forgetPassword(UserModel user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
