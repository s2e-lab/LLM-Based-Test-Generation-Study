package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Simplify {
    /**
     * Your task is to implement a function that will simplify the expression
     * x * n. The function returns True if x * n evaluates to a whole number and False
     * otherwise. Both x and n, are string representation of a fraction, and have the following format,
     * <numerator>/<denominator> where both numerator and denominator are positive whole numbers.

     * You can assume that x, and n are valid fractions, and do not have zero as denominator.

     */
    public static Boolean simplify(String x, String n) {
    // a, b = x.split("/")
    // c, d = n.split("/")
    // numerator = int(a) * int(c)
    // denom = int(b) * int(d)
    // if (numerator/denom == int(numerator/denom)):
    //     return True
    // return False
    // convert to java
    String[] a = x.split("/");
    String[] b = n.split("/");
    int numerator = Integer.parseInt(a[0]) * Integer.parseInt(b[0]);
    int denom = Integer.parseInt(a[1]) * Integer.parseInt(b[1]);
    if (numerator%denom == 0){
        return true;
    }
    return false;
}

}