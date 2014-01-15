/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mu.utils;

import com.mu.resource.CSSRes;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luye66
 */
public class DropletToolsTest {
    
    public DropletToolsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPackageName method, of class DropletTools.
     */
    @Test
    public void testGetPackageName() {
        System.out.println("getPackageName");
        Class className = CSSRes.class;
        String expResult = "com.mu.resource";
        String result = DropletTools.getPackageName(className);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPackageURL method, of class DropletTools.
     */
    @Test
    public void testGetPackageURL() {
        System.out.println("getPackageURL");
        Class className = CSSRes.class;;
        String expResult = "/com/mu/resource";
        String result = DropletTools.getPackageURL(className);
        assertEquals(expResult, result);
    }
}