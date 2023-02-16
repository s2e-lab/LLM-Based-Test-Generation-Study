package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static junit.framework.TestCase.assertEquals;


class IsPrime {
    
    public static Boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}