package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SumProduct {
    
    public static List<Integer> sumProduct(List<Object> numbers) {
        Integer sum = 0;
        Integer product = 1;
        for (Object number : numbers) {
            if (number instanceof Integer) {
                sum += (Integer) number;
                product *= (Integer) number;
            } else {
                throw new IllegalArgumentException("Invalid number type");
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(sum);
        result.add(product);
        return result;
    }

}