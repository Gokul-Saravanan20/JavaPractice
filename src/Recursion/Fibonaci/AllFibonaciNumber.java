package Recursion.Fibonaci;

import java.util.Scanner;

public class AllFibonaciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the how many fibonaci numbers you need : ");
        int n = sc.nextInt();

        System.out.println(fibo(n));
    }
    private static int fibo(int n){
        int i = 0;
        int j = 1;
        return fiboRec(i,j,n);
    }
   private static int fiboRec(int i,int j,int n){
        if(n == 1) return i;
       System.out.println(i);
        return fiboRec(i+j,i,n-1);
   }
}
