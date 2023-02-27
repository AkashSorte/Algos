package com.types.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeDeserialize {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "X";
        String rootVal = String.valueOf(root.val);
        String leftSerialized = serialize(root.left);
        String rightSerialized = serialize(root.right);
        return rootVal + leftSerialized + rightSerialized;
    }

    TreeNode decode(Queue<String> queue) {

        if (queue.size()==0) return null;

        String value = queue.remove();
        if (value.equals("X")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(value));
        root.left = decode(queue);
        root.right = decode(queue);
        return root;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null)
            return null;

        Queue<String> queue = new LinkedList<>();
        for (String c: data.split(""))
            queue.add(c);

        TreeNode node= decode(queue);
        return node;
    }

    public static void main(String[] args) {
        TreeNode test = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        SerializeDeserialize serializeDeserialize = new SerializeDeserialize();
        String serilizedText = serializeDeserialize.serialize(test);
        System.out.println( "serialized text:" + serilizedText);

        TreeNode result = serializeDeserialize.deserialize(serilizedText);
         System.out.println(result);
    }

}
