package Binary_Search.TwoDimentionalArray;

import java.util.Arrays;

public class RowWiseAndColumnWiseSorted {
    public static void main(String[] args) {
        int[][] matrix = { {10,20,30,40},
                           {15,25,35,45},
                           {28,29,37,49},
                           {33,34,38,50}
                        };

        System.out.println(Arrays.toString(binarySearchInRowAndColumnWiseSorted(matrix,10)));
    }
    public static int[] binarySearchInRowAndColumnWiseSorted(int[][] matrix,int target){
        int row = 0;
        int column = matrix[0].length-1;

        while (row < matrix.length && column >= 0){
            if(target == matrix[row][column]){
                return new int[] {row,column};
            }else if(matrix[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
