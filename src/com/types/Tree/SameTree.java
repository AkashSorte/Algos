package com.types.Tree;

public class SameTree {
    String left = "";
    String right = "";
    public boolean isSameTree(TreeNode p, TreeNode q) {
        leftTraverse(p);
        int[] test;
        rightTraverse(q);
        return left.equals(right);
    }

    private void leftTraverse(TreeNode node) {
        if (node == null) {
            left = left + "$";
            return;
        }

        left = left + String.valueOf(node.val);
        leftTraverse(node.left);
        leftTraverse(node.right);

    }

    private void rightTraverse(TreeNode node) {
        if (node == null) {
            right = right + "$";
            return;
        }

        right = right + String.valueOf(node.val);
        rightTraverse(node.left);
        rightTraverse(node.right);

    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(new SameTree().isSameTree(p, q));
    }
}
