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
    public void testMain() {
        System.out.println("main not tested");
    }
    
    @Test
    public void testRun(){
        System.out.println("run not tested");
    }
    
    @Test
    public void testPrintAllGroceries(){
        System.out.println("printAllGroceries not tested");
    }
    
    
    //Testing without using equals override method
    @Test
    public void testCreateCollections(){
        CSCI310 instance = new CSCI310();
        instance.createCollections();
        assertEquals("Apples", instance.groceries.get(0).name);
        assertEquals(5, instance.groceries.get(0).quantity);
        assertEquals("Grapes", instance.groceries.get(1).name);
        assertEquals(1, instance.groceries.get(1).quantity);
        assertEquals("Oranges", instance.groceries.get(2).name);
        assertEquals(20, instance.groceries.get(2).quantity);
        assertEquals("Pickles", instance.groceries.get(3).name);
        assertEquals(7, instance.groceries.get(3).quantity);
    }
    
    
    //Testing with using equals override method
    @Test
    public void testSortGroceryList(){
        CSCI310 instance = new CSCI310();
        instance.createCollections();
        instance.sortGroceryList();
        assertTrue(instance.groceries.get(0).equals(new GroceryList("Grapes", 1)));
        assertTrue(instance.groceries.get(1).equals(new GroceryList("Apples", 5)));
        assertTrue(instance.groceries.get(2).equals(new GroceryList("Pickles", 7)));
        assertTrue(instance.groceries.get(3).equals(new GroceryList("Oranges", 20)));
    }
    
    @Test
    public void testSortByName(){
        CSCI310 instance = new CSCI310();
        instance.createCollections();
        instance.sortByName();
        assertTrue(instance.groceries.get(0).equals(new GroceryList("Apples", 5)));
        assertTrue(instance.groceries.get(1).equals(new GroceryList("Grapes", 1)));
        assertTrue(instance.groceries.get(2).equals(new GroceryList("Oranges", 20)));
        assertTrue(instance.groceries.get(3).equals(new GroceryList("Pickles", 7)));
    }
    
    @Test
    public void testCompareByName(){
        GroceryList apples = new GroceryList("Apples", 7);
        GroceryList bananas = new GroceryList("Bananas", 1);
        int result = apples.compareByName(bananas);
        assertEquals(result, -1);
        assertEquals(bananas.compareByName(apples), 1);
    }
    
    @Test
    public void testCompareTo(){
        GroceryList apples = new GroceryList("Apples", 7);
        GroceryList apples2 = new GroceryList("Apples", 1);
        GroceryList grapes = new GroceryList("Grapes", 45);
        //Showing that if the names are equal the compare method then looks
        //at the quantities of the item
        assertEquals(apples2.compareTo(apples), -1);
        assertEquals(apples.compareTo(apples2), 1);
        assertEquals(grapes.compareTo(apples), 1);
        assertEquals(grapes.compareTo(apples2), 1);
        assertEquals(apples2.compareTo(grapes), -1);
        assertEquals(apples.compareTo(grapes), -1);
    }
    
    @Test
    public void testPrint(){
        System.out.println("print not tested");
    }
    
    @Test
    public void testGroceryList(){
        String name = "Apples";
        int quantity = 7;
        GroceryList item = new GroceryList(name, quantity);
        assertEquals(name, item.name);
        assertEquals(quantity, item.quantity);
    }
}
