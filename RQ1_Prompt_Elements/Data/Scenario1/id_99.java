package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class ClosestInteger {
    
    public static int closestInteger(String value) {
        double d = Double.parseDouble(value);
        if (d > 0) {
            return (int) Math.floor(d + 0.5);
        } else {
            return (int) Math.ceil(d - 0.5);
        }
    }

}