QUESTION 7 – TREE: PREORDER TRAVERSAL
Inspired by HackerRank
Problem
Complete the function in the editor below, which has parameter: a pointer to the root of a binary tree. It must print the values in the tree's preorder traversal as a single line of space-separated values.
Input Format
Our test code passes the root node of a binary tree to the preOrder function.
Constraints
Nodes in the tree
Output Format
Print the tree's preorder traversal as a single line of space-separated values.
  
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Main {
    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        preOrder(root);
        System.out.println();

        sc.close();
    }
}
