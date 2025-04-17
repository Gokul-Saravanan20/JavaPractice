package Recursion.Fibonaci;

public class O_1_fibo {
    public static void main(String[] args) {
//        for (int i = 0; i < 11; i++) {
//            System.out.print(fibo(i) + " ");
//        }

        System.out.println(fibo(5));
    }
    public static long fibo(int n){
        return (long) ((long) (Math.pow(((1+Math.sqrt(5))/2),n) / Math.sqrt(5)));
    }
}
