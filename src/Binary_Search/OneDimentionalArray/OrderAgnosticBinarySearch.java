package Binary_Search.OneDimentionalArray;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

    }
    public static int binary_search(int[] arr,int target){
        if(arr[0] < arr[arr.length-1]) return binaryAcending(arr,target);
        return binaryDescending(arr,target);
    }
    private static int binaryAcending(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    private static int binaryDescending(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                start = mid + 1;
            }else if(target > arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
