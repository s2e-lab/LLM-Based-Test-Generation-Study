package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class IsEqualToSumEven {
    
    public static Boolean isEqualToSumEven(int n) {
        if (n < 8) {
            return false;
        }
        return n % 2 == 0;
    }

}