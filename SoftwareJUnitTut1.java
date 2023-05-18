package com.company;

// Why?
// 1. Make sure that your method runs for all input
// 2. You can refactor your code depending on the Unit test
// 3. You cannot release your code with print

// google code style: https://www.cs.cornell.edu/courses/JavaAndDS/JavaStyle.html#NameMethod
// Requirements vs Test requirements vs Test cases.
// Create main
// Create test file assertEquals
// coverage
// multiple assertEquals
// multiple methods for different assert
// initialize object global
// second method
// assertTrue assertFalse
// ToDo: Requirements:
//  Withdraw1(int balance, int amountOfWithdraw): return balance -1.
//  Withdraw2(int balance, int amountOfWithdraw): return true/false.
//  -> Test Requirements?
//           1. user balance >= amount of withdraw (valid)
//           2. user balance == amount of withdraw (valid)
//           3. user balance < amount of withdraw (not valid)
//  -> Test cases?
//           1. balance 20$ amount of withdraw 10$


public class SoftwareJUnitTut1 {

    // Remove 'A's from the first two characters.
    // e.g., AACD->CD. CDAA->CDAA. AB->B. AA->.
    public String removeAFromFirstTwoChar(String s){
        if(s.length() < 2){
            return s.replace("A","");
        }
        String firstTwo = s.substring(0,2);
        String rest = s.substring(2);
        return firstTwo.replace("A", "") + rest;
    }



    // ABCD->False. AABGAA->True. AB->True A->False
    public boolean isSameFirstSameLast(String s){
        if(s.length() <= 1){
            return false;
        }else if(s.length() == 2){
            return true;
        }
        String firstTwo = s.substring(0,2);
        String lastTwo = s.substring(s.length()-2);
        return firstTwo.equals(lastTwo);
    }



}
