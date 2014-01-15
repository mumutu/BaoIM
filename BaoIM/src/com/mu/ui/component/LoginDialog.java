/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui.component;

import com.mu.ui.ability.FileDropable;
import com.mu.ui.framework.Ability;
import com.mu.ui.framework.AbilityType;
import com.mu.ui.utils.DropletFXMLLoader;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.layout.AnchorPane;

/**
 * 显示登录画面
 * @author luye66
 */

public class LoginDialog extends AnchorPane implements FileDropable{
    
    //control relative
     @FXML 
     private TextField username;
     
    
    final static String SELF = "LoginDialog";
    public LoginDialog()
    {
        try {
            DropletFXMLLoader.loadFxml(SELF,this,this);
        } catch (IOException ex) {
            Logger.getLogger(LoginDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void dragOverHandler(DragEvent event) {
        System.out.println("Something over");
    }

    @Override
    public void dragDroppedHandler(List<File> files) {
         System.out.println("Something down");
    }
}
