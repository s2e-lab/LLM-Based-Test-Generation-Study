package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Monotonic {
    
    public static Boolean monotonic(List<Integer> l) {
        int size = l.size();
        if (size == 1) {
            return true;
        }
        int direction = l.get(1) - l.get(0);
        for (int i = 1; i < size - 1; i++) {
            if (direction == 0) {
                direction = l.get(i + 1) - l.get(i);
            } else if (direction > 0) {
                if (l.get(i + 1) < l.get(i)) {
                    return false;
                }
            } else {
                if (l.get(i + 1) > l.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }

}