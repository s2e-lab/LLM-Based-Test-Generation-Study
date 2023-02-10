package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HexKey {
    
    public static int hexKey(Object num) {
        int result = 0;
        String hex = num.toString();
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (c == '2' || c == '3' || c == '5' || c == '7' || c == 'B' || c == 'D') {
                result++;
            }
        }
        return result;
    }

}