package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Modp {
    /**
     * Return 2^n modulo p (be aware of numerics).
    
     */
    public static int modp(int n, int p) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = (result * 2) % p;
        }
        return result;
    }

}