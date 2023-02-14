package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Iscube {
    /**
     * * Write a function that takes an integer a and returns True 
     * if this ingeger is a cube of some integer number.
     * Note: you may assume the input is always valid.
    
     */
    public static Boolean iscube(int a) {
        if (a < 0) {
            return iscube(-a);
        }
        int i = 0;
        while (i * i * i < a) {
            i++;
        }
        return i * i * i == a;
    }

}