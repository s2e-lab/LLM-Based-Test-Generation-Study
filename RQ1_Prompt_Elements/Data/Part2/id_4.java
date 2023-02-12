package Part2;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class MeanAbsoluteDeviation {
    /**
     * For a given list of input numbers, calculate Mean Absolute Deviation
     * around the mean of this dataset.
     * Mean Absolute Deviation is the average absolute difference between each
     * element and a centerpoint (mean in this case):
     * MAD = average | x - x_mean |
    
     */
    public static Double meanAbsoluteDeviation(List<Double> numbers) {
        Double mean = 0.0;
        for (Double number : numbers) {
            mean += number;
        }
        mean /= numbers.size();
        Double mad = 0.0;
        for (Double number : numbers) {
            mad += Math.abs(number - mean);
        }
        return mad / numbers.size();
    }

}