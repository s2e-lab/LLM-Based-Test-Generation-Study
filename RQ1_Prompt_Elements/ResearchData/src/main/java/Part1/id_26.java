package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static junit.framework.TestCase.assertEquals;


class RemoveDuplicates {
    
    public static List<Object> removeDuplicates(List<Object> numbers) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.indexOf(numbers.get(i)) == numbers.lastIndexOf(numbers.get(i))) {
                result.add(numbers.get(i));
            }
        }
        return result;
    }

}