/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui.framework;

import com.mu.ui.ability.FileDropable;
import java.lang.annotation.Annotation;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;

/**
 * 根据顺序添加行为
 * @author luye66
 */
public class NotationDealer {
    
    public static void setListener(final Node node)
    {
        for(Annotation annotation:node.getClass().getAnnotations())
        {
            if(annotation.annotationType().equals(Ability.class))
            {
                for(AbilityType type:((Ability)annotation).value())
                {
                    type.apply(node);
                }
            }
        }
    }
}
