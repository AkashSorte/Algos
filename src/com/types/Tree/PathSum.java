package com.types.Tree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;


        if (root.left == null & root.right == null)
            return root.val == targetSum;

        return (root.left != null && addNode(root.left, root.val, targetSum)) || (root.right != null && addNode(root.right, root.val, targetSum));
    }


    private boolean addNode(TreeNode node, int sum, int targetSum) {

        sum = sum + node.val;

        if (node.left != null || node.right != null) {
            return (node.left != null && addNode(node.left, sum, targetSum)) || (node.right!= null && addNode(node.right, sum, targetSum));
        } else
            return sum == targetSum;


    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, new TreeNode(5), null), null), null), null);
        int target = 6;

        System.out.println(new PathSum().hasPathSum(treeNode, target));
    }
}
