/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.newSession.NewSessionDao;
import interfaces.NewSessionCallBack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Formation;
import view.AllSessions;

/**
 *
 * @author macbook
 */
public class AllSessionController implements ActionListener {

    private AllSessions allSession;
    private NewSessionCallBack newSessionCallBack;
    private DefaultTableModel model;
    private List<Formation> listFormations;

    public AllSessionController(AllSessions allSession, DefaultTableModel model) {
        this.allSession = allSession;
        this.model = model;
        newSessionCallBack = new NewSessionDao();
    }

    public void initController() {
       loadData();
    }

    private void loadData() {
        if (newSessionCallBack.getAllSessions() != null) {

            listFormations = newSessionCallBack.getAllSessions();
            model.setRowCount(0);
            for (int i = 0; i < listFormations.size(); i++) {
                model.insertRow(model.getRowCount(), new Object[]{
                    listFormations.get(i).getId(), listFormations.get(i).getNbrSemaine(),
                    listFormations.get(i).getNbrParticipant(), listFormations.get(i).getDate(), listFormations.get(i).getDescription(),
                    listFormations.get(i).getDateDebut(), listFormations.get(i).getPayant()
                });
            }
        }
        if (model != null) {
            allSession.getUpdateSessionsTable().setModel(model);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
