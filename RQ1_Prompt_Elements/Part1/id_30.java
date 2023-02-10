package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GetPositive {
    
    public static List<Object> getPositive(List<Object> l) {
        List<Object> result = new ArrayList<Object>();
        for (Object value : l) {
            if (value instanceof Integer) {
                int i = (Integer) value;
                if (i > 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

}