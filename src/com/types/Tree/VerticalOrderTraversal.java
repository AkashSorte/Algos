package com.types.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class VerticalOrderTraversal {

    void dfs(TreeNode current, Integer col, Integer row,  TreeMap<Integer, TreeMap<Integer, List<Integer>>> resultMap) {

        if (current == null)
            return;

        TreeMap<Integer, List<Integer>> map = resultMap.get(col);

        if (map == null)
            map = new TreeMap<>();


        List<Integer> list = map.get(row);
        if (list == null)
            list = new ArrayList<>();

        list.add(current.val);
        Collections.sort(list);
        map.put(row, list);


        resultMap.put(col, map);

        dfs(current.left, col-1, row+1, resultMap);

        dfs(current.right, col+1, row+1, resultMap);


    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<>();

        TreeMap<Integer, TreeMap<Integer, List<Integer>>> resultMap = new TreeMap<>();

        dfs(root, 0,0, resultMap);
        System.out.println(resultMap);
        return resultMap.values().stream().map(x -> x.values().stream().flatMap(list -> list.stream()).collect(Collectors.toList())).collect(Collectors.toList());


    }

    public static void main(String[] args) {
        // [3,9,20,null,null,15,7]
        // [3,1,4,0,2,2]
        // TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        //TreeNode root = new TreeNode(3, new TreeNode(1, new TreeNode(0), new TreeNode(2)), new TreeNode(4, new TreeNode(2), null));
        // [1,2,3,4,6,5,7]
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(6)), new TreeNode(3, new TreeNode(5), new TreeNode(7)));
        System.out.println(new VerticalOrderTraversal().verticalTraversal(root));
    }
}
