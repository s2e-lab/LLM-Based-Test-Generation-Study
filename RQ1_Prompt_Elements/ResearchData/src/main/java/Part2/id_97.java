package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Multiply {
    /**
     * Complete the function that takes two integers and returns 
     * the product of their unit digits.
     * Assume the input is always valid.
     */
    public static int multiply(int a, int b) {
        if( a<0 ) a = -a;
        if( b<0 ) b = -b;
        return (a % 10) * (b % 10);
    }

}