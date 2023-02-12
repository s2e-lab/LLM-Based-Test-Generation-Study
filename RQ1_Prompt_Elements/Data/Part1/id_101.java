package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class WordsString {
    
    public static List<Object> wordsString(String s) {
        if(s.length()==0)
            return new ArrayList<Object>();
        String[] words = s.split("[, ]+");
        return Arrays.asList(words);
    }

}