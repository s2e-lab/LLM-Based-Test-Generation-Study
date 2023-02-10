package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Simplify {
    
    public static Boolean simplify(String x, String n) {

    String[] a = x.split("/");
    String[] b = n.split("/");
    int numerator = Integer.parseInt(a[0]) * Integer.parseInt(b[0]);
    int denom = Integer.parseInt(a[1]) * Integer.parseInt(b[1]);
    if (numerator%denom == 0){
        return true;
    }
    return false;
    }

}