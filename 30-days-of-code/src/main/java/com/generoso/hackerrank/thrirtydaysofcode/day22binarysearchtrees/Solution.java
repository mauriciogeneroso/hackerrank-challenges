package com.generoso.hackerrank.thrirtydaysofcode.day22binarysearchtrees;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    public static int getHeight(Node root) {
        int leftHeight = 0;
        int rightHeight = 0;

        if (root.left != null) {
            leftHeight += getHeight(root.left);
        }
        if (root.right != null) {
            rightHeight += getHeight(root.right);
        }

        if (root.left == null && root.right == null) {
            return 0;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

//    public static int getHeight(Node root){
//        int leftHeight = 0;
//        int rightHeight = 0;
//
//        if (root.left != null) {
//            leftHeight = 1 + getHeight(root.left);
//        }
//
//        if (root.right != null) {
//            rightHeight = 1 + getHeight(root.right);
//        }
//
//        return leftHeight > rightHeight ? leftHeight : rightHeight;
//    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
