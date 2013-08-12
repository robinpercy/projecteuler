package com.robinpercy;

import java.util.*;
import java.lang.Math;

/**
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 **/
public class Problem4 {
    static Long largest = 997799L;
    public static void main(String[] args) {
        Long palindrome = largest;
        while (palindrome != null) {
            System.out.println(palindrome);
            if (factor(palindrome)) {
                System.out.println("Largest palindrome: "+ palindrome);
                return;
            }
            palindrome = nextPalindrome(palindrome);
        }

    }

    static Long nextPalindrome(Long current) {
        Long prefix = (current / 1000) % 1000;
        Long next = null;
        prefix--;
        if ( prefix != 0) {
            next = prefix * 1000;
            next += 100 * (prefix % 10);
            next += 10 * ((prefix % 100) / 10);
            next += prefix / 100;
        } 
        return next;
    }

    static boolean factor(Long product) {
        for(int i = 999; i > 99; i--) {
            for(int j = i; j > 99; j--) {
                if ( i * j == product) {
                    System.out.println(String.format("Found: %d x %d = %d", i, j, product));
                    return true;
                }
            }
        }
        return false;
    }
}

