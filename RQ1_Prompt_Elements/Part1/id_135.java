package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CanArrange {
    
    public static int canArrange(List<Object> arr) {
        int max = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                if (i > 0 && (int) arr.get(i) < (int) arr.get(i - 1)) {
                    max = i;
                }
            }
        }
        return max;
    }

}