package DataStructures.BinarSearchTree;

public class Functions extends TreeNode{
     TreeNode root;
    static TreeNode temp;
    public  void add(int data){
         root= addRec(root,data);
    }

    private TreeNode addRec(TreeNode root, int data){
        if(root == null) return new TreeNode(data);
        else{
            if(root.data < data) root.right = addRec(root.right,data);
            else root.left = addRec(root.left,data);
        }
        return root;
    }
    public  void display(){
        System.out.println();
        if(root != null) inOrderTravasal(root);
    }
    private void inOrderTravasal(TreeNode root){
        if(root != null){
            inOrderTravasal(root.left);
            System.out.print(root.data + " ");
            inOrderTravasal(root.right);
        }
    }

    public boolean contains(int data){
        System.out.println();
        if(root != null) return contains2(root,data);
        return false;
    }
    private boolean contains2(TreeNode root,int data){
        if(root == null) return false;
        if(root.data == data) return true;
        if(data < root.data)  return contains2(root.left,data);
        else return contains2(root.right,data);
    }
    public int minimum(){
        System.out.println();
        if (root != null) return minimumRec(root);
        return -1;
    }
    private int minimumRec(TreeNode root){

        if(root == null) return -1;
        if(root.left == null) return root.data;
        if(root.left.left == null) return root.left.data;
        else return minimumRec(root.left);
    }

    public int maximum(){
        return maximumRec(root);
    }
    private int maximumRec(TreeNode root){
        if(root == null) return -1;
        if(root.right == null) return root.data;
        if(root.right.right == null) return root.right.data;
        else return maximumRec(root.right);
    }
    public TreeNode delete(int data){
        return delete(root,data);
    }

    private TreeNode delete(TreeNode root,int data){
        if(data < root.data) root.left = delete(root.left,data);
        else if(data > root.data) root.right =  delete(root.right,data);
        else{
           if(root.right == null) return root.left;
           else if (root.left == null) return root.right;
           else{
               TreeNode temp = root;
               while (temp.right != null) temp = temp.right;
               root.right = delete(root.right, temp.data);
           }
        }
        return root;
    }
}


