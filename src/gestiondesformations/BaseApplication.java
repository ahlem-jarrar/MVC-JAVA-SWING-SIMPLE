/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondesformations;

import controller.LoginController;
import dao.login.LoginDao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import model.LoginModel;
import view.LoginView;

/**
 *
 * @author Ahlem Jarrar
 */
public class BaseApplication {

    /**
     * @param args the command line arguments
     */
    private static LoginView loginView= null;
    private static LoginModel loginModel = null;
    private static LoginController loginController = null;
    public static void main(String[] args) throws MalformedURLException {
           loginView = new LoginView("Login Page",600,600);
             System.out.println("test 1");
           loginModel = new LoginModel();
           LoginDao loginDao = new LoginDao(); 
           loginController = new LoginController(loginView,loginDao);
           loginController.initController();
//              JWindow window = new JWindow();
//        window.getContentPane().add(
//                new JLabel("", new ImageIcon(new URL("http://docs.oracle.com/javase/tutorial/uiswing/examples/misc/SplashDemoProject/src/misc/images/splash.gif")), SwingConstants.CENTER)).setBackground(new Color(0, 0, 0, 0));
//
//        //Set the window's bounds, centering the window
//        int width = 305;
//        int height = 200;
//        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//        int x = (screen.width - width) / 2;
//        int y = (screen.height - height) / 2;
//        window.setBounds(x, y, width, height);
//
//        window.setVisible(true);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
    
}
