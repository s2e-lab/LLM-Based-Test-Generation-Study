package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class GreatestCommonDivisor {
    /**
     * Return a greatest common divisor of two integers a and b
    
     */
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return greatestCommonDivisor(b % a, a);
    }

}