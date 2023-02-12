package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ChangeBase {
    
    public static String changeBase(int x, int base) {
        String result = "";
        while (x > 0) {
            result = (x % base) + result;
            x = x / base;
        }
        return result;
    }

}