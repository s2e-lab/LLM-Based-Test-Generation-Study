package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class IncrList {
    /**
     * Return list with elements incremented by 1.
    
     */
    public static List<Object> incrList(List<Object> l) {
        List<Object> result = new ArrayList<Object>();
        for (Object value : l) {
            if (value instanceof Integer) {
                int i = (Integer) value;
                result.add(i + 1);
            }
        }
        return result;
    }

}