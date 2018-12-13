/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author macbook
 */
public class Connexion {
    private static Connection connection;
    private String url = "";
    
    
     private Connexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:8888/gestion_formations","root","root");
        }
        catch(SQLException|ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static Connection getInstance(){
       if(connection==null)
            new Connexion();
        
        return connection;
    }
    
    
}
