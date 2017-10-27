/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dalton
 */
public class CSCI310Test {
    
    public CSCI310Test() {
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
     * Test of main method, of class CSCI310.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main not tested");
    }

    /**
     * Test of run method, of class CSCI310.
     */
    @Test
    public void testRun() {
        System.out.println("run not tested");
    }

    /**
     * Test of runThread method, of class CSCI310.
     */
    @Test
    public void testRunThread() {
        System.out.println("runThread not tested");
    }

    /**
     * Test of runStream method, of class CSCI310.
     */
    @Test
    public void testRunStream() {
        System.out.println("runStream not tested");
    }
    
    @Test
    public void threadMathTest(){
        System.out.println("testing threadMath");
        threadMath tm = new threadMath(4);
        threadMath tm2 = new threadMath(-455);
        assertEquals(4, tm.number);
        assertEquals(-455, tm2.number);
    }
    
    //Couldn't make tests for a lot of stuff in this program
    
}
