package RecursionAndBackTracking.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraySubSet {
    static void ArraySubSets(int[] arr, int index, List<Integer> current){
        //Base case
        if(index== arr.length){
            System.out.println(current);
            return;
        }
        //add element
        current.add(arr[index]);
        ArraySubSets(arr, index+1,current);

        //Backtracking
        current.remove(current.size()-1);

        //skip and explore
        ArraySubSets(arr, index+1,current);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArraySubSets(arr,0, new ArrayList<>());
    }
}
