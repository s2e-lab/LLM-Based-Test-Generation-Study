package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IsHappy {
    
    public static Boolean isHappy(String s) {
        if (s.length() < 3) {
            return false;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2) || s.charAt(i + 1) == s.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }

}