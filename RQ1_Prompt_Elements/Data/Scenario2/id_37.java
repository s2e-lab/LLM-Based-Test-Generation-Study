package scenario2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class SortEven {
    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the odd indicies, while its values at the even indicies are equal
     * to the values of the even indicies of l, but sorted.
    
     */
    public static List<Integer> sortEven(List<Integer> l) {
        List<Integer> l2 = new ArrayList<Integer>(l);
        for(int i = 0; i < l.size(); i++){
            if(i % 2 == 0){
                List<Integer> subl = new ArrayList<Integer>();
                for(int j = 0; j < l.size(); j++){
                    if(j % 2 == 0){
                        subl.add(l.get(j));
                    }
                }
                Collections.sort(subl);
                l2.set(i, subl.get(i / 2));
            }
        }
        return l2;
    }

}