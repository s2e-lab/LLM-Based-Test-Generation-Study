package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class CycpatternCheck {
    /**
     * You are given 2 words. You need to return True if the second word or any of its rotations is a substring in the first word
    
     */
    public static Boolean cycpatternCheck(String a, String b) {
    int l = b.length();
    String pat = b + b;
    for (int i = 0; i < a.length() - l + 1; i++){
        for (int j = 0; j < l + 1; j++){
            if (a.substring(i, i+l).equals(pat.substring(j, j+l))){
                return true;
            }
        }
    }
    return false;
    }

}