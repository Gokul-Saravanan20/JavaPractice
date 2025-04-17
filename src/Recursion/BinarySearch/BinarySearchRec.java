package Recursion.BinarySearch;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr, 0, arr.length-1, 0));
    }

    public static int binarySearch(int[] arr, int start, int end, int key) {
        if (start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == key) return mid;
        else if(key < arr[mid]) return binarySearch(arr,start,mid-1,key);
        else return binarySearch(arr,mid+1,end,key);
    }
}