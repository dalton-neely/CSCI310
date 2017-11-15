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
public interface Groceries extends Comparable <Groceries> {
    @Override
    public String toString();
    public boolean equals(GroceryList o);
    public int compareByName(GroceryList object);
    public void copy(GroceryList object);
}
