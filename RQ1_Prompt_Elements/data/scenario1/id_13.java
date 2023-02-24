package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class GreatestCommonDivisor {
    
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return greatestCommonDivisor(b % a, a);
    }

}