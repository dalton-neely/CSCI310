/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310;

import java.util.Random;

/**
 *
 * @author Dalton
 */
public class threadMath extends Thread {
    int number;
    threadMath(int _num){
        number = _num;
    }
    public void compute(){
        Random rdn = new Random((int)System.nanoTime());
        System.out.println("Thread # "+ number +" outcome: " + (rdn.nextInt() + rdn.nextInt() + rdn.nextInt()));
    }
    
    @Override
    public void run(){
        Random rdn = new Random((int)System.nanoTime());
        System.out.println("Thread # "+ number +" outcome: " + (rdn.nextInt() + rdn.nextInt() + rdn.nextInt()));
    }
    
}
