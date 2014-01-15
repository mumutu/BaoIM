/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.ui.ability;

import javafx.beans.property.StringProperty;

/**
 * Loadingable 接口 提供给 uicomponent 用于判断是否显示loading画面
 * TODO
 * @author luye66
 */
public interface Loadingable {
    
    /**
     * 
     * @return 返回任务整体大小
     */
    public int getTotle();
    
    /**
     * 
     * @return 返回当前大小
     */
    public int getCurrent();
    
    /**
     * 
     * @return StringProperty 可能显示的内容
     */
    public StringProperty getLoadingStr();
}
