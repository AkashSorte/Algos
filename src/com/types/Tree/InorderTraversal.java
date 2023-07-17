package com.types.Tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {

        addTreeNode(root);
        return result;
    }

    public void addTreeNode(TreeNode node) {
        if (node == null)
            return;

        addTreeNode(node.left);
        result.add(node.val);
        addTreeNode(node.right);

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        System.out.println(new InorderTraversal().inorderTraversal(node));
    }

}
