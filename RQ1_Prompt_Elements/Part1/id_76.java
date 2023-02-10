package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IsSimplePower {
    
    public static Boolean isSimplePower(int x, int n) {
        if (x == 1) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        int y = n;
        while (y < x) {
            y *= n;
        }
        return y == x;
    }

}