package Part2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Specialfilter {
    /**
     * Write a function that takes an array of numbers as input and returns 
     * the number of elements in the array that are greater than 10 and both 
     * first and last digits of a number are odd (1, 3, 5, 7, 9).
     * For example:
     
     */
    public static int specialfilter(List<Object> nums) {
        // count = 0
        // for num in nums:
        //     if num > 10:
        //         odd_digits = (1, 3, 5, 7, 9)
        //         number_as_string = str(num)
        //         if int(number_as_string[0]) in odd_digits and int(number_as_string[-1]) in odd_digits:
        //             count += 1
            
        // return count 
        // convert to java
        int count = 0;
        for (Object num : nums){
            if ((int)num > 10){
                
                Set odd_digits = new HashSet<Integer>(Arrays.asList(1, 3, 5, 7, 9));
                String number_as_string = Integer.toString((int)num);
                if (odd_digits.contains(Integer.parseInt(number_as_string.substring(0,1))) && odd_digits.contains(Integer.parseInt(number_as_string.substring(number_as_string.length()-1)))){
                    count += 1;
                }
            }
        }
        return count;
    }

}