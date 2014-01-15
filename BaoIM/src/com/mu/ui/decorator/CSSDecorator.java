/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui.decorator;

import com.mu.resource.CSSRes;
import javafx.scene.Node;
import javafx.scene.Parent;

/**
 * 修饰类封装定位成固定的修改
 * @author luye66
 */
public class CSSDecorator extends Parent{
    private Parent target;
    
    public CSSDecorator(Parent target,String cssFilenameStr)
    {
        this.target = target;
        target.getStylesheets().add(CSSRes.getCss(cssFilenameStr));
//        Node self = target.lookup("#chart");

    }
    
    
    /**
     * 返回修改后的
     * @return 被修改后的
     */
    public Parent getView()
    {
        return target;
    }
    
//    
    
    
}
