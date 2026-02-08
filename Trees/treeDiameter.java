import java.util.*;
public class treeDiameter {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh, rh) + 1;
        return height;
    }
    public static int diameter(Node root){
        if(root == null){
            return -1;
        }
        int leftd = diameter(root.left);
        int rightd = diameter(root.right);

        int lefth = height(root.left);
        int righth = height(root.right);
        int selfd = lefth + righth + 1;

        return Math.max(selfd, Math.max(leftd, rightd));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root));
    }
}
