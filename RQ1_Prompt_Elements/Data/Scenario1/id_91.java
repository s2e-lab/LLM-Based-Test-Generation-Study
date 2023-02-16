package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class IsBored {

    public static int isBored(String s) {
        int count = 0;
        String[] sentences = s.split("[.!?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            boolean firstWord = false;
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                else {
                    firstWord = true;
                    if (word.startsWith("I")) {
                        count++;
                    }
                }
                if (firstWord)
                    break;
            }

        }
        return count;
    }

}