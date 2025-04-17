package Sortings;

import java.util.Arrays;

public class MainForSorting {
    public static void main(String[] args) {
        int[] arr = {6,1,2,5,4,3};
        Sorting sorting = new Implementation();
//        sorting.bubble(arr);
          sorting.selection(arr);
          //changed



        System.out.println(Arrays.toString(arr));
    }
}
