package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int numOfJumps;
        if(k < j){
             numOfJumps = k;
        } else {
            numOfJumps = k/j + (k%j);
        }


        return numOfJumps;
    }
}
