/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310;

/**
 *
 * @author Dalton
 */
public class GroceryList implements Groceries {
    
    public String name;
    public int quantity;
    
    GroceryList(String _name, int _qty){
        name = _name;
        quantity = _qty;
    }
    
    @Override
    public String toString(){
        return "("+name+", "+quantity+")";
    }
    
    @Override
    public int compareTo(Groceries o) {
        if(o instanceof GroceryList){
            GroceryList groceryList = (GroceryList) o;
            //Compare the name First before the quantity
            if(name.compareTo(groceryList.name) < 0){
                return -1;
            }
            if(name.compareTo(groceryList.name) > 0){
                return 1;
            }
            if(quantity < groceryList.quantity){
                return -1;
            }
            if(quantity > groceryList.quantity){
                return 1;
            }
            return 0;
        }else{
            return this.getClass().getName().compareTo(o.getClass().getName());
        }
    }
    
}
