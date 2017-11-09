/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310; 

import java.util.ArrayList;

/**
 *
 * @author Dalton
 */
public class CSCI310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        CSCI310 app = new CSCI310();
        app.run();
    }
    
    public void run(){
        runThread();
        runStream();
    }
    
    public void runThread(){
        for(int i = 0; i < 10; i++){
            (new threadMath(i)).start();
        }
    }
    
    public void runStream(){
        ArrayList <threadMath> arr = new ArrayList <threadMath> ();
        for(int i = 100; i < 110; i++){
            threadMath tm = new threadMath(i);
            arr.add(tm);
        }
        arr.parallelStream().forEach(math ->{math.compute();});
    }
}
