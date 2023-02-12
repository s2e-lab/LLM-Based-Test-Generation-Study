package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class AnyInt {
    /**
     * * Create a function that takes 3 numbers.
     * Returns true if one of the numbers is equal to the sum of the other two, and all numbers are integers.
     * Returns false in any other cases.
    
     */
    public static Boolean anyInt(Number x, Number y, Number z) {
        if (x instanceof Integer && y instanceof Integer && z instanceof Integer) {
            if (x.intValue() == y.intValue() + z.intValue()) {
                return true;
            }
            if (y.intValue() == x.intValue() + z.intValue()) {
                return true;
            }
            if (z.intValue() == x.intValue() + y.intValue()) {
                return true;
            }
        }
        return false;
    }

}