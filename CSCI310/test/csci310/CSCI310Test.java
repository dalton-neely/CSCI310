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
        String _course = "blah";
        int _id = 480;
        CSCI310 instance = new CSCI310();
        instance.run();
        boolean expResult = true;
        boolean result = instance.updateCourse(_course, _id);
        assertEquals(expResult, result);
        assertEquals(false, instance.updateCourse("kjkjkjkj", 88));
        
    }

    /**
     * Test of updateStudents method, of class CSCI310.
     */
    @Test
    public void testUpdateStudents() {
        System.out.println("updateStudents");
        int _students = 0;
        int _id = 480;
        CSCI310 instance = new CSCI310();
        instance.run();
        boolean expResult = true;
        boolean result = instance.updateStudents(_students, _id);
        assertEquals(expResult, result);
        assertEquals(false, instance.updateStudents(32434, 34));
    }

    /**
     * Test of query method, of class CSCI310.
     */
    @Test
    public void testQuery() {
        System.out.println("query");
        String _sql = "DROP TABLE kjklj";
        CSCI310 instance = new CSCI310();
        instance.run();
        boolean expResult = false;
        boolean result = instance.query(_sql);
        assertEquals(expResult, result);
    }

    /**
     * Test of createTable method, of class CSCI310.
     */
    @Test
    public void testCreateTable() {
        System.out.println("createTable");
        String _sql = "";
        CSCI310 instance = new CSCI310();
        instance.run();
        boolean expResult = false;
        boolean result = instance.createTable(_sql);
        assertEquals(expResult, result);
        instance.createTable("CREATE TABLE IF NOT EXISTS classes (\\n id integer,\\n course text NOT NULL,\\n students integer\\n);");
        instance.insertTable(480, "Theroy of Algorithms", 11);
        assertTrue(instance.getCourseById(480).compareTo("Theroy of Algorithms") == 0);
    }

    /**
     * Test of insertTable method, of class CSCI310.
     */
    @Test
    public void testInsertTable() {
        System.out.println("insertTable");
        int _id = 0;
        String _course = "sfgfdg";
        int _students = 0;
        CSCI310 instance = new CSCI310();
        instance.run();
        instance.insertTable(_id, _course, _students);
        assertTrue(instance.getCourseById(0).compareTo("sfgfdg") == 0);
    }

    /**
     * Test of deleteById method, of class CSCI310.
     */
    @Test
    public void testDeleteById() {
        System.out.println("deleteById");
        int _id = 480;
        CSCI310 instance = new CSCI310();
        instance.run();
        boolean result = instance.deleteById(_id);
        assertTrue(result);
    }

    /**
     * Test of getCourseById method, of class CSCI310.
     */
    @Test
    public void testGetCourseById() {
        System.out.println("getCourseById");
        int _id = 480;
        CSCI310 instance = new CSCI310();
        instance.run();
        String expResult = "Theroy of Algorithms";
        String result = instance.getCourseById(_id);
        assertEquals(expResult, result);
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
