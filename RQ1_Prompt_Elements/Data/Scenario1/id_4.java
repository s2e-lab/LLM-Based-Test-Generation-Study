package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class MeanAbsoluteDeviation {
    
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