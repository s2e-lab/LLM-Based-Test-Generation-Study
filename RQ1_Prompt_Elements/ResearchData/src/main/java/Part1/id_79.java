package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DecimalToBinary {
    
    public static String decimalToBinary(int decimal) {
        String binary = "";
        if (decimal == 0) {
            return "db0db";
        }
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        return "db" + binary + "db";
    }

}