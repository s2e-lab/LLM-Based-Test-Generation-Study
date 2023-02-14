package Part1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class TruncateNumber {
    public static Double truncateNumber(Double number) {
        // return number - Math.floor(number);
        return Math.round((number - Math.floor(number)) * 1000.0) / 1000.0;
    }

}