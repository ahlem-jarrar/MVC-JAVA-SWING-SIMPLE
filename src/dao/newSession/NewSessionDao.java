/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.newSession;

import dao.Connexion;
import interfaces.NewSessionCallBack;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Formation;

/**
 *
 * @author macbook
 */
public class NewSessionDao implements NewSessionCallBack  {
    
    
    private List<Formation> listFormation;

    @Override
    public void insertData(Formation fomration) {
          try {
            PreparedStatement statement = Connexion.getConnection().prepareStatement(""
                    + "INSERT INTO fomration (id, nbrSemaine, nbrParticipant,date,description,dateDebut,payant) VALUES (null, ?, ?,?,?,?,?)");
            statement.setInt(1, fomration.getNbrSemaine());
            statement.setInt(2, fomration.getNbrParticipant());
            statement.setString(3, fomration.getDate());
            statement.setString(4, fomration.getDescription());
            statement.setString(5, fomration.getDate());
            statement.setInt(6, fomration.getPayant());
            statement.executeUpdate();
            statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(NewSessionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Formation> getAllSessions() {
       listFormation = new ArrayList<Formation>();
        
        try {
            
            Statement statement = Connexion.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM formation");
            
            while (result.next()) { 
                Formation formation = new Formation();
                formation.setId(result.getInt(1));
                formation.setDateDebut(result.getString("dateDebut"));
                formation.setDescription(result.getString("description"));
                formation.setNbrParticipant(result.getInt("nbrSemaine"));
                formation.setNbrSemaine(result.getInt("nbrParticipant"));
                formation.setPayant(result.getInt("payant"));
                listFormation.add(formation);
            }
            
            
            statement.close();
            result.close();
            return listFormation;
        } catch (SQLException ex) {
            Logger.getLogger(NewSessionDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public void updateSession(Formation formation) {
           try {
            PreparedStatement statement = Connexion.getConnection().prepareStatement(""
                    + "UPDATE formation SET nbrSemaine=?, nbrParticipant=?, date=?, description=?, dateDebut=?, payant=? WHERE id=?");
            
            statement.setInt(1, formation.getNbrSemaine());
            statement.setInt(2, formation.getNbrParticipant());
            statement.setString(3, formation.getDate());
            statement.setString(4, formation.getDescription());
            statement.setString(5, formation.getDateDebut());
            statement.executeUpdate();
            
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(NewSessionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
