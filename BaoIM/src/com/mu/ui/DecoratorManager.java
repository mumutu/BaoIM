/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui;

import javafx.scene.Node;

/**
 *
 * @author luye66
 */
public enum DecoratorManager {
    INSANCE;
    
    public void doDecorate(Node target)
    {
        //TODO:修改对象
        System.out.println("decorator");
    }
}
