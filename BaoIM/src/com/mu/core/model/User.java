/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.core.model;

import javafx.beans.binding.StringBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.jivesoftware.smack.packet.Presence;

/**
 * User 所有用户个体的基础类 
 * @author luye66
 */
public class User {
    private StringProperty username;
    private StringProperty bareJID;
    private StringProperty resource;
    private StringProperty displayName;
    
    private Presence presence;
    
    
    public User(){
//        displayName = Bindings.when(username.isNotNull()).then(username).otherwise(bareJID);
        username = new SimpleStringProperty();
        bareJID = new SimpleStringProperty();
    }
    
    final public String getUsername()
    {
        return username.getValue();
    }
    
    final public void setUsername(String value)
    {
        username.setValue(value);
    }
    
    final public StringProperty usernameProperty()
    {
        return username;
    }
    
    final public String getBareJID()
    {
        return bareJID.getValue();
    }
    
    final public void setBareJID(String value)
    {
        bareJID.setValue(value);
    }
    
    final public StringProperty bareJIDProperty()
    {
        return bareJID;
    }
}
