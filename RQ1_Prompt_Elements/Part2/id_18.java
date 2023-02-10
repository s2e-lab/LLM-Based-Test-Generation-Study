package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class HowManyTimes {
    /**
     * Find how many times a given substring can be found in the original string. Count overlaping cases.
     
     */
    public static int howManyTimes(String string, String substring) {
        int count = 0;
        int index = 0;
        while (index < string.length()) {
            index = string.indexOf(substring, index);
            if (index == -1) {
                break;
            }
            count++;
            index++;
        }
        return count;
    }

}