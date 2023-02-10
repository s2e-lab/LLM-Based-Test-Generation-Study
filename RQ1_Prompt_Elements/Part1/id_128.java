package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProdSigns {
    
    public static Integer prodSigns(List<Object> arr) {
        if (arr.isEmpty()) {
            return null;
        }
        int prod = 1;
        int sum = 0;
        for (Object value : arr) {
            if (value instanceof Integer) {
                int num = (Integer) value;
                if (num > 0) {
                    prod *= 1;
                } else if (num < 0) {
                    prod *= -1;
                } else {
                    prod *= 0;
                }
                sum += Math.abs(num);
            }
        }
        return sum * prod;
    }

}