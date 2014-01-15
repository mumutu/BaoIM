/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.utils;

import com.mu.resource.CSSRes;

/**
 *
 * @author luye66
 */
public class DropletTools {
    
    /**
     * 获取类的包名
     * @param className
     * @return packageName
     */
    public static String getPackageName(Class className)
    {
        return className==null?null:className.getPackage().getName();
    }
    
    public static String getPackageURL(Class className)
    {
        return className==null?null:"/"+className.getPackage().getName().replaceAll("\\.","/");
    }
}
