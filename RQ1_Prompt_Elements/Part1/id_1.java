package Part1;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SeparateParenGroups {
  
    public static List<String> separateParenGroups(String parenString) {
        List<String> result = new ArrayList<String>();
        int count = 0;
        StringBuilder curString = new StringBuilder();
        for (int i = 0; i < parenString.length(); i++) {
            if (parenString.charAt(i) == '(') {
                count++;
                curString.append('(');
            } else if (parenString.charAt(i) == ')') {
                count--;
                curString.append(')');
                if(count==0){
                    result.add(curString.toString());
                    curString = new StringBuilder();

                }
            }
        }
        return result;
    }

}