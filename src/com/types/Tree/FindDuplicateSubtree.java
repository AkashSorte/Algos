package com.types.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtree {


    void getBranch(TreeNode node, String branch) {
        if (node == null) return;

        branch = branch + String.valueOf(node.val);
        getBranch(node.left, branch);
        getBranch(node.right, branch);
    }

    void dfs(TreeNode node, Map<String, Integer> map) {

    }

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<>();



        return null;
    }
}
