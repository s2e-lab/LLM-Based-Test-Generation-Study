package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Modp {
    
    public static int modp(int n, int p) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * 2) % p;
        }
        return result;
    }

}