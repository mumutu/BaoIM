/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui.ability;

import java.io.File;
import java.util.List;
import javafx.scene.input.DragEvent;

/**
 * 允许文件拖拽
 * TODO 如何实现
 * @author luye66
 */
public interface FileDropable {
    
    public void dragOverHandler(DragEvent event);
    
    public void dragDroppedHandler(List<File> files);
}
