/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import helper.CustomJFrame;
import interfaces.CommonCallBack;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author macbook
 */
public class LoginView extends CustomJFrame implements CommonCallBack{
    
    private JTextField  userEmailTextField,userPasswordTextFiled ;
    private JButton loginBtn,forgotPasswordBtn,signUpBtn ;
    private BoxLayout boxLayout = null;
    private Container container = null;
    
    public LoginView(String title, int width, int heigh) {
        super(title, width, heigh);
        userEmailTextField = new JTextField();
        userPasswordTextFiled = new JTextField();
        loginBtn = new JButton("Log In"); 
        forgotPasswordBtn = new JButton("Forgot password?"); 
        signUpBtn = new JButton("Sign up!");
        container = getContentPane();
        boxLayout = new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS);
        this.setLayout(boxLayout);
        this.add(userEmailTextField);
        this.add(userPasswordTextFiled);
        this.add(loginBtn);
        this.add(forgotPasswordBtn);
        this.add(signUpBtn);
    }

    public JTextField getUserEmailTextField() {
        return userEmailTextField;
    }

    public void setUserEmailTextField(JTextField userEmailTextField) {
        this.userEmailTextField = userEmailTextField;
    }

    public JTextField getUserPasswordTextFiled() {
        return userPasswordTextFiled;
    }

    public void setUserPasswordTextFiled(JTextField userPasswordTextFiled) {
        this.userPasswordTextFiled = userPasswordTextFiled;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(JButton loginBtn) {
        this.loginBtn = loginBtn;
    }

    public JButton getForgotPasswordBtn() {
        return forgotPasswordBtn;
    }

    public void setForgotPasswordBtn(JButton forgotPasswordBtn) {
        this.forgotPasswordBtn = forgotPasswordBtn;
    }

    public JButton getSignUpBtn() {
        return signUpBtn;
    }

    public void setSignUpBtn(JButton signUpBtn) {
        this.signUpBtn = signUpBtn;
    }

    public BoxLayout getBoxLayout() {
        return boxLayout;
    }

    public void setBoxLayout(BoxLayout boxLayout) {
        this.boxLayout = boxLayout;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }   

    @Override
    public void onGetSucces() {
        JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.");

    }

    @Override
    public void onGetFailed(String message) {
    JOptionPane.showMessageDialog(this, "Eggs are not supposed to be green.");
    }

    @Override
    public void onGetError(String error) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
