/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310; 

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dalton
 */
public class CSCI310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CSCI310 instance = new CSCI310();
        instance.run();
    }
    
    ArrayList<GroceryList> groceries = new ArrayList<GroceryList>();
    
    public void createCollections(){
        groceries.add(new GroceryList("Apples", 5));
        groceries.add(new GroceryList("Grapes", 1));
        groceries.add(new GroceryList("Oranges", 20));
        groceries.add(new GroceryList("Pickles", 7));
    }
    
    public void sortGroceryList(){
        Collections.sort(groceries);
    }
    
    public void run(){
        
    }
    
}
