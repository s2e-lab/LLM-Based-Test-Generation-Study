package scenario1;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class Iscube {
    
    public static Boolean iscube(int a) {
        if (a < 0) {
            return iscube(-a);
        }
        int i = 0;
        while (i * i * i < a) {
            i++;
        }
        return i * i * i == a;
    }

}