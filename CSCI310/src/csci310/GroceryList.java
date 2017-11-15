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

    @Override
    public int compareTo(Directive to) {
        if(to instanceof RelayDirective){
            RelayDirective relay = (RelayDirective) to;
            if(gpio < relay.gpio) return  -1;
            if(gpio > relay.gpio) return 1;
            if(setting == false && relay.setting == true) return -1;
            if(setting == true && relay.setting == false) return 1;
            return 0;
        }else{
            return this.getClass().getName().compareTo(to.getClass().getName());
        }
    }
    
    @Override
    public int compareTo(Groceries o) {
        if(o instanceof Groceries){
            Groceries groceries = (Groceries) o;
            return 0;
        }else{
            return this.getClass().getName().compareTo(o.getClass().getName());
        }
    }
    
}
