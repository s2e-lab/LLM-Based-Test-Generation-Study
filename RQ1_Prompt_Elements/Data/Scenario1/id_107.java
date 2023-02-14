package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class EvenOddPalindrome {
    
    public static List<Integer> evenOddPalindrome(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        result.add(even);
        result.add(odd);
        return result;
    }

}