package Sortings;

import java.util.Arrays;

public class MainForSorting {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        Sorting sorting = new Implementaions();
//        sorting.bubble(arr);
          sorting.selection(arr);



        System.out.println(Arrays.toString(arr));
    }
}
