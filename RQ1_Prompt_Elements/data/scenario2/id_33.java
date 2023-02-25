package scenario2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class SortThird {
    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the indicies that are not divisible by three, while its values at the indicies that are divisible by three are equal
     * to the values of the corresponding indicies of l, but sorted.
    
     */
    public static List<Integer> sortThird(List<Integer> l) {
        List<Integer> l2 = new ArrayList<Integer>(l);
        for(int i = 0; i < l.size(); i++){
            if(i % 3 == 0){
                List<Integer> subl = new ArrayList<Integer>();
                for(int j = 0; j < l.size(); j++){
                    if(j % 3 == 0){
                        subl.add(l.get(j));
                    }
                }
                Collections.sort(subl);
                l2.set(i, subl.get(i / 3));
            }
        }
        return l2;
    }

}