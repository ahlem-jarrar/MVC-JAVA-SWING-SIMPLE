/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;
import model.Formation;

/**
 *
 * @author macbook
 */
public interface NewSessionCallBack {
    public void insertData(Formation fomration);
    public List<Formation> getAllSessions();
    public void updateSession(Formation formation);
    
}
