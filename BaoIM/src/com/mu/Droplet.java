/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu;

import com.mu.ui.UIComponent;
import com.mu.ui.component.LoginDialog;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author luye66
 */
public class Droplet extends Application {
       
    @Override
    public void start(Stage stage) throws Exception {
          
//        DropletFXMLLoader.loadFxml("LoginDialog");
//        stage.setScene(new Scene(new CSSDecorator(panel,"LoginDialog")));
       
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene((LoginDialog)UIComponent.INSTANCE.getUI("LoginDialog"));
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

