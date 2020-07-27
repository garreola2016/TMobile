/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garreola.checkwriter;

/**
 *
 * @author garre
 */
public class CheckWriter {
    
    static void convertToWord(char[] number){
        System.out.println(number);
    
        int length = number.length;
        System.out.println(length);
        
        String[] singleDigits = new String[] {"zero" , "one", "two", "three", "four", "five" , "six", "seven" , "eight" , "nine"};
        System.out.println(singleDigits.length);
        
//        String[] doubleDigits = new String[]{"ten", "eleven", "twelve" , "thirteen", "fourteen", "fifteen", "sixteen", "seventeen","eightteen", "nineteen"};
        
        
        if (length ==1 ){
           
           int index = Integer.parseInt(String.valueOf(number));
            System.out.println(index);
//           conversion is needed! ascii

            System.out.println(singleDigits[index]);
            return;
            
        }
        
            
    
    }
       
    
    public static void main(String[] args) {
        //driver code
        convertToWord("1".toCharArray());
    }
    
}
