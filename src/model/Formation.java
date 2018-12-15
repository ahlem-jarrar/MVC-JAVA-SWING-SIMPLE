/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author macbook
 */
public class Formation implements Serializable 
{
    private int id ;
    private String serialUId ="";
    private int nbrSemaine ;
    private int nbrParticipant;
    private String date;
     private String description;
    private String dateDebut;
    private int payant;

    public Formation(int id, int nbrSemaine, int nbrParticipant, String date, String description, String dateDebut, int payant) {
        this.id = id;
        this.nbrSemaine = nbrSemaine;
        this.nbrParticipant = nbrParticipant;
        this.date = date;
        this.description = description;
        this.dateDebut = dateDebut;
        this.payant = payant;
    }
     public Formation() {
      
    }
    
   

    public String getSerialUId() {
        return serialUId;
    }

    public void setSerialUId(String serialUId) {
        this.serialUId = serialUId;
    }

    public int getNbrSemaine() {
        return nbrSemaine;
    }

    public void setNbrSemaine(int nbrSemaine) {
        this.nbrSemaine = nbrSemaine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getPayant() {
        return payant;
    }

    public void setPayant(int payant) {
        this.payant = payant;
    }
    
     public int getNbrParticipant() {
        return nbrParticipant;
    }

    public void setNbrParticipant(int nbrParticipant) {
        this.nbrParticipant = nbrParticipant;
    }
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
}
