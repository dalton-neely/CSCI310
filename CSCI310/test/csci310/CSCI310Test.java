/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310;

import java.sql.Connection;
import java.sql.SQLException;
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
    public void testMain() {
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
     * Test of disconnect method, of class CSCI310.
     */
    @Test
    public void testDisconnect() {
        System.out.println("disconnect");
        CSCI310 instance = new CSCI310();
        //instance.conn = instance.getConnection("jdbc:sqlite:sample.db");
        instance.disconnect();
        boolean value;
        try{
            value = instance.conn.isClosed();
        }catch(SQLException e){
            value = true;
        }
        assertTrue(value);
    }
    
    @Test
    public void testConstructor(){
        System.out.println("testing constructor");
        CSCI310 instance = new CSCI310();
        boolean value = false;
        try{
            value = instance.conn.isValid(0);
        }catch(SQLException e){
            
        }
        assertTrue(value);
    }

    /**
     * Test of updateId method, of class CSCI310.
     */
    @Test
    public void testUpdateId() {
        System.out.println("updateId");
        int _id = 480;
        int _new = 20;
        CSCI310 instance = new CSCI310();
        instance.run();
        boolean expResult = true;
        boolean result = instance.updateId(_id, _new);
        assertEquals(expResult, result);
        assertEquals(false, instance.updateId(200, 45));
    }

    /**
     * Test of updateCourse method, of class CSCI310.
     */
    @Test
    public void testUpdateCourse() {
        System.out.println("updateCourse");
        String _course = "";
        int _id = 0;
        CSCI310 instance = new CSCI310();
        boolean expResult = false;
        boolean result = instance.updateCourse(_course, _id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudents method, of class CSCI310.
     */
    @Test
    public void testUpdateStudents() {
        System.out.println("updateStudents");
        int _students = 0;
        int _id = 0;
        CSCI310 instance = new CSCI310();
        boolean expResult = false;
        boolean result = instance.updateStudents(_students, _id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class CSCI310.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        String _url = "";
        CSCI310 instance = new CSCI310();
        Connection expResult = null;
        Connection result = instance.getConnection(_url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of query method, of class CSCI310.
     */
    @Test
    public void testQuery() {
        System.out.println("query");
        String _sql = "";
        CSCI310 instance = new CSCI310();
        boolean expResult = false;
        boolean result = instance.query(_sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTable method, of class CSCI310.
     */
    @Test
    public void testCreateTable() {
        System.out.println("createTable");
        String _sql = "";
        CSCI310 instance = new CSCI310();
        boolean expResult = false;
        boolean result = instance.createTable(_sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertTable method, of class CSCI310.
     */
    @Test
    public void testInsertTable() {
        System.out.println("insertTable");
        int _id = 0;
        String _course = "";
        int _students = 0;
        CSCI310 instance = new CSCI310();
        instance.insertTable(_id, _course, _students);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteById method, of class CSCI310.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        int _id = 0;
        CSCI310 instance = new CSCI310();
        boolean expResult = false;
        boolean result = instance.deleteById(_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseById method, of class CSCI310.
     */
    @Test
    public void testGetCourseById() {
        System.out.println("getCourseById");
        int _id = 0;
        CSCI310 instance = new CSCI310();
        String expResult = "";
        String result = instance.getCourseById(_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudentsById method, of class CSCI310.
     */
    @Test
    public void testGetStudentsById() {
        System.out.println("getStudentsById");
        int _id = 0;
        CSCI310 instance = new CSCI310();
        int expResult = 0;
        int result = instance.getStudentsById(_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdByCourse method, of class CSCI310.
     */
    @Test
    public void testGetIdByCourse() {
        System.out.println("getIdByCourse");
        String _course = "";
        CSCI310 instance = new CSCI310();
        int expResult = 0;
        int result = instance.getIdByCourse(_course);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectAll method, of class CSCI310.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        CSCI310 instance = new CSCI310();
        instance.selectAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
