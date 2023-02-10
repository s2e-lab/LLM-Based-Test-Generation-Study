package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ChooseNum {
    
    public static int chooseNum(int x, int y) {
        int max = -1;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0 && i > max) {
                max = i;
            }
        }
        return max;
    }

}