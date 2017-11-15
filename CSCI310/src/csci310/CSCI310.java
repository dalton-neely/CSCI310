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
    
    public void sortByName(){
        for(int i = 0; i < groceries.size(); i++){
            for(int j = 0; j < groceries.size() - 1; j++){
                if(groceries.get(j).name.compareTo(groceries.get(j + 1).name) > 0){
                    GroceryList temp = new GroceryList();
                    temp.copy(groceries.get(j));
                    groceries.get(j).copy(groceries.get(j + 1));
                    groceries.get(j + 1).copy(temp);
                }
            }
        }
        System.out.println("");
    }
    
    public void printAllGroceries(){
        for(int i = 0; i < groceries.size(); i++){
            System.out.println(groceries.get(i).toString());
        }
    }
    
    public void run(){
        createCollections();
        sortByName();
        printAllGroceries();
    }
    
}
