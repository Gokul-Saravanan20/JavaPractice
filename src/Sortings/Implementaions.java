package Sortings;

public class Implementaions implements Sorting{

    @Override
    public void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // It is called a pass

            boolean swapped = false; // checking the pass is swapped or not

            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j] < arr[j-1]){  //swap
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }

            if(!swapped) break;
        }
    }

    @Override
    public void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = getMax(arr,i, arr.length-i); // element I am going to replace
            int index = arr.length-i; // the position I want to replace the element
            

        }
    }


    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int getMax(int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i < end; i++){
            if(arr[i] > max){
                max = i;
            }
        }
        return max;
    }
}
