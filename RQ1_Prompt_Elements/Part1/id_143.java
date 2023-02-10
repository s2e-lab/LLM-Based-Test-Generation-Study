package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WordsInSentence {
    
    public static String wordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (isPrime(words[i].length())) {
                result += words[i] + " ";
            }
        }
        return result.trim();
    }

}