/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.login;

import model.UserModel;

/**
 *
 * @author macbook
 */
public interface LoginDaoCallBack {
    public boolean connexion(UserModel user);
    public void createUser(UserModel user);
    public void forgetPassword(UserModel user);
}
