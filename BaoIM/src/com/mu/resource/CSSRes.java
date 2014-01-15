/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.resource;

import com.mu.utils.DropletTools;
import java.util.Collection;

/**
 *
 * @author luye66
 */
public class CSSRes {
    
    
    public static String getCss(String cssFilenameStr)
    {
        return CSSRes.class.getResource(DropletTools.getPackageURL(CSSRes.class)+"/css/"+cssFilenameStr+".css").toExternalForm();
    }
            
}
