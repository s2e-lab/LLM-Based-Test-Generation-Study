package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Multiply {
    
    public static int multiply(int a, int b) {
        if( a<0 ) a = -a;
        if( b<0 ) b = -b;
        return (a % 10) * (b % 10);
    }

}