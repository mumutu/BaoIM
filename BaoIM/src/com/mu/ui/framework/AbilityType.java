/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui.framework;

import com.mu.ui.ability.FileDropable;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;

/**
 * 增加一些对于node的行为方法，这里的用法比较奇特，属于练习
 * @author luye66
 */
public enum AbilityType {
    FILEDROP { 
        void apply(final Node node){
            node.setOnDragOver(new EventHandler<DragEvent>(){

                            @Override
                            public void handle(DragEvent event) {
                                event.acceptTransferModes(TransferMode.ANY);
                                ((FileDropable)node).dragOverHandler(event);
                                event.consume();
                            }

                        });

             node.setOnDragDropped(new EventHandler<DragEvent>(){

                            @Override
                            public void handle(DragEvent event) {
                                Dragboard db = event.getDragboard();
                                boolean success = false;
                                if (db.hasFiles()) {
                                    try{
                                    ((FileDropable)node).dragDroppedHandler(db.getFiles());
                                     success = true;
                                    }catch(Exception ex){
                                        //we don't care currently
                                        //should be in logs
                                    }
                                }
                                event.setDropCompleted(success);
                                event.consume();
                            }
        });
       }
    },
    LOADING {
        void apply(final Node node)
        {
            System.out.println("增加了Loading方法");
        }
    };
    
    
    abstract void apply(final Node node);
}
