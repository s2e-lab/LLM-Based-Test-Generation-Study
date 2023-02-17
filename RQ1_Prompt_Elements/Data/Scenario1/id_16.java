package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class CountDistinctCharacters {
    
    public static int countDistinctCharacters(String string) {
        Set<Character> distinctCharacters = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++) {
            distinctCharacters.add(Character.toLowerCase(string.charAt(i)));
        }
        return distinctCharacters.size();
    }

}