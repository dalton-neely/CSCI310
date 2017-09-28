/*
 Dalton Neely
 Homework2
 9/27/2017
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310; 

import java.util.Scanner;

/**
 *
 * @author Dalton
 */
public class CSCI310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        CSCI310 app = new CSCI310();
        app.run();
    }
    //T is the number of inputs 1<=T<=30
    int T = 0;
    //N is an array holding N which is the amount of forward rotation 1<=N<=27
    int N[] = new int[31];
    //strArr is to hold the strings to reverse and rotate
    String strArr[] = new String[30];
    //alphabet is the alphabet used for rotation of characters
    StringBuilder alphabet = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ_.");
    
    /*
        This funciton reads the input using a Scanner object. The function counts
        the number of entries stored in T, stores the amount of forward rotation
        in the array N, and stores the string to be messed with in the array strArr.
        The input should stop reading once a zero is read in for the forward rotation.
    */
    public void readInput(Scanner _in){
        N[0] = _in.nextInt();
        int i = 0;
        while(N[i] != 0){
            strArr[i] = _in.nextLine().trim();
            i++;
            T++;
            N[i] = _in.nextInt();
        }
    }
    
    public void readInput(){
        Scanner in = new Scanner(System.in);
        readInput(in);
    }
    
    /*
        This funciton solves the problem by reversing the input and shifting
        each character by the value placed in the N array.
    */
    
    public void solveProblem(){
        Character current;
        int index;
        for(int i = 0; i < T; i++){
            //Use StringBuilder object to make manipulation easy
            StringBuilder temp = new StringBuilder(strArr[i]);
            //Reverse String
            temp.reverse();
            //Iterate through the length of the given string
            for(int j = 0; j < temp.length(); j++){
                //Get the character of index j
                current = new Character(temp.charAt(j));
                //find the index of the current character in the alphabet string
                index = alphabet.indexOf(current.toString());
                //Rotate that index forward by the value stored in the N array
                index = index + N[i];
                //If the index is bigger than 27, roll it back to the begining of index
                if(index >= 28){
                    index = index - 28;
                }
                //set the character in the string to be manipulated with the new character
                temp.setCharAt(j, alphabet.charAt(index));
            }
            //Store the StringBuilder object in the string array
            strArr[i] = temp.toString();
        }
    }
    
    /*
        This funciton simply outputs the values stored in the string array, which
        if called after readInput and solveProblem, should out put strings reversed
        and rotated forward.
    */
    
    public void writeOutput(){
        for(int i = 0; i < T; i++){
            System.out.println(strArr[i]);
        }
    }
    
    public void run() throws Exception{
        readInput();
        solveProblem();
        writeOutput();
    }
    
}
