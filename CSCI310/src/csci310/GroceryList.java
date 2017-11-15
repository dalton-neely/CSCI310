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
    
    GroceryList(){
        name = null;
        quantity = 0;
    }
    
    GroceryList(String _name, int _qty){
        name = _name;
        quantity = _qty;
    }
    
    public void copy(GroceryList object){
        name = object.name;
        quantity = object.quantity;
    }
    
    public int compareByName(GroceryList object){
        return name.compareTo(object.name);
    }
    
    @Override
    public String toString(){
        return "("+name+", "+quantity+")";
    }
    
    @Override
    public boolean equals(GroceryList o){
        if(name == o.name && quantity == o.quantity){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public int compareTo(Groceries o) {
        if(o instanceof GroceryList){
            GroceryList groceryList = (GroceryList) o;
            //Compare the quantity before the name
            if(quantity < groceryList.quantity){
                return -1;
            }
            if(quantity > groceryList.quantity){
                return 1;
            }
            if(name.compareTo(groceryList.name) < 0){
                return -1;
            }
            if(name.compareTo(groceryList.name) > 0){
                return 1;
            }
            return 0;
        }else{
            return this.getClass().getName().compareTo(o.getClass().getName());
        }
    }
    
}
