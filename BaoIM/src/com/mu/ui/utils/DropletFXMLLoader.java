/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui.utils;

import com.mu.ui.component.LoginDialog;
import java.io.IOException;
import java.io.InputStream;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;

/**
 * DropletFXMLLoader 封装FXML工具类函数
 * 主要包含FXML文件和css文件
 * @author luye66
 */
public class DropletFXMLLoader {
    
    
    /**
     * TODO setLocation
     * @param fxmlName
     * @param target
     * @param controller
     * @throws IOException 
     */
    public static void loadFxml(String fxmlName,Object target,Object controller) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        if(target != null){
            loader.setRoot(target);
        }
        if(controller != null){
            loader.setController(controller);
        }
        InputStream in = DropletFXMLLoader.class.getResourceAsStream("/com/mu/resource/fxml/"+fxmlName+".fxml");
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(DropletFXMLLoader.class.getResource(fxmlName));
        try {
            loader.load(in);
        } finally {
            in.close();
        } 
    }
}
