/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui;

import com.mu.ui.framework.NotationDealer;
import com.mu.utils.DropletTools;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Node;

/**
 * UIComponent ui的入口类 装载ui
 *  实现流程 loading  ==> 
 * @author luye66
 */
public enum UIComponent {
    INSTANCE;
    
    
    
    /**
     * 装载自定义control 使用方法是name convention 
     * e.g uiStr="login" 
     * then uiClass="Login.class" uiFXML="Login.fxml"
     * uiDecorator="LoginDeco.class"
     * custom control 可选接口 loadingable （暂时）
     * @param uiStr 代表ui的名字
     * @return 
     */
    public Node getUI(String uiStr)
    {
        Node node = null;
        try {
            //先创建一个control类 包装在component中
            Class uiClass = Class.forName(DropletTools.getPackageName(this.getClass())+".component."+uiStr);
            if(Node.class.isAssignableFrom(uiClass))
            {
                node = (Node)uiClass.newInstance();
                NotationDealer.setListener(node); //添加一些行为
                DecoratorManager.INSANCE.doDecorate(node);//
            }
        } catch (ClassNotFoundException |InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(UIComponent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return node;
    }
}
