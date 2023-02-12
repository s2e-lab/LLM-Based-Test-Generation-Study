package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class Histogram {
    /**
     * Given a string representing a space separated lowercase letters, return a dictionary
     * of the letter with the most repetition and containing the corresponding count.
     * If several letters have the same occurrence, return all of them.
     * 
     * Example:
     * histogram('a b c') == {'a': 1, 'b': 1, 'c': 1}
     * histogram('a b b a') == {'a': 2, 'b': 2}
     * histogram('a b c a b') == {'a': 2, 'b': 2}
     * histogram('b b b b a') == {'b': 4}
     * histogram('') == {}

     *
     * > histogram("a b b a")
     * {"a": 2, "b": 2}
     * > histogram("a b c a b")
     * {"a": 2, "b": 2}
     * > histogram("a b c d g")
     * {"a": 1, "b": 1, "c": 1, "d": 1, "g": 1}
     * > histogram("r t g")
     * {"r": 1, "t": 1, "g": 1}
     * > histogram("b b b b a")
     * {"b": 4}
     * > histogram("r t g")
     * {"r": 1, "t": 1, "g": 1}
     * > histogram("")
     * {}
     * > histogram("a")
     * {"a": 1}
     */
    public static Object histogram(String test) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = test.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("")){
                continue;
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }


}