package com.types.Tree;

import javax.sound.midi.Soundbank;

public class CousinsOrNot {

    TreeNode parent1, parent2;
    int depth1, depth2;

    void dfs(TreeNode curr, TreeNode parent, int depth, int x, int y) {

        if (curr == null)
            return;

        if (curr.val == x) {
            parent1 = curr;
            depth1= depth;
        }

        if (curr.val == y) {
            parent2 = curr;
            depth2 = depth;
        }

        dfs(curr.left, curr, depth+1, x, y);
        dfs(curr.right, curr, depth+1, x, y);

    }

    public boolean isCousins(TreeNode root, int x, int y) {

        if (root == null)
            return false;

        dfs(root, null,0, x, y);
        return parent1 != null && parent2 != null && depth1==depth2 && parent1!=parent2;
    }

    public static void main(String[] args) {
      // [1,2,3,null,4,null,5]
         TreeNode node = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5)));
        System.out.println(new CousinsOrNot().isCousins(node, 5, 4));

    }
}
