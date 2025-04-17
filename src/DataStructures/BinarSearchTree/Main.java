package DataStructures.BinarSearchTree;

public class Main{
    public static void main(String[] args) {
        Functions fun1 = new Functions();
        fun1.add(10);
        fun1.add(5);
        fun1.add(11);
        fun1.add(3);
        fun1.add(7);
        fun1.add(6);
        fun1.add(2);

        fun1.display();
        fun1.delete(6);
        fun1.display();
    }
}
