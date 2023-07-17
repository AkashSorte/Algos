package com.types.Tree;

public class ArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length ==0) {
            return null;
        }


        int mid = nums.length/2;
        TreeNode node = new TreeNode(nums[mid]);


        for (int i=0; i<nums.length; i++) {
            add(node, nums[i]);

        }
        return node;

    }

    private void add(TreeNode node, int i) {
        if (node == null) {
            node = new TreeNode(i);
            return;
        }

        if (node.val > i) {
            add(node.left, i);
        } else if (node.val < i ) {
            add(node.right, i);
        }

    }

    public static void main(String[] args) {
        int[] values = new int[]{-10,-3,0,5,9};
        System.out.println(new ArrayToBST().sortedArrayToBST(values));
    }
}
