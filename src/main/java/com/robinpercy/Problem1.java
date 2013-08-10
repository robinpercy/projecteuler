package com.robinpercy;

import java.util.HashSet;
/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
**/
public class Problem1 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<Integer>();
        for (int i = 1; i < 334; i++) {
            nums.add(i*3);
            if ( i < 200) {
                nums.add(i*5);
            } 
        } 
        
        int solution = 0;
        for (Integer n : nums) {
            System.out.println("Adding" + n); 
            solution += n;
        }

        System.out.println(""+solution);
    }
}


