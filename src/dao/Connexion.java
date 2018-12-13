/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class Connexion {
    
    
    private static Connection connection;
    
    public static Connection getConnection(){
        
        if (connection == null){
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
               
                connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/gestion_formations","root","root");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
        
    return connection;
    }
    
    public static void main(String[] args) {
        
      Connexion.getConnection();
    }
    
    
}
