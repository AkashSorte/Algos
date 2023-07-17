//package com.types.Tree;
//
//import java.util.Collections;
//import java.util.List;
//
//public class PathSum2 {
//    List<List<Integer>> result = new ArrayList<>();
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//
//        if (root == null)
//            return result;
//
//        addToList(root, targetSum, new ArrayList<Integer>());
//
//        return result;
//
//    }
//
//    private void addToList(TreeNode node, int target, List<Integer> list) {
//        if (node.left == null && node.right==null && target == addAll(list)) {
//            result.add(list);
//        }
//
//        list.add(node.val);
//
//        List<Integer> tempList = list;
//        if (node.left != null)
//            addToList(node.left, target, tempList);
//
//        if (node.right != null)
//            addToList(node.right, target, tempList);
//
//    }
//
//    private int addAll(List<Integer> list) {
//        int sum =0;
//        for (Integer i : list)
//            sum += i;
//        return sum;
//    }
//
//    public TreeNode getTreeNode(List<Integer> list) {
//        // [5,4,8,11,null,13,4,7,2,null,null,5,1]
//        if (list == null && list.isEmpty())
//            return null;
//
//        TreeNode treeNode = new TreeNode();
//        //list
//
//    }
//
//    public static void main(String[] args) {
//
//        TreeNode node = new TreeNode();
//
//
//    }
//}
