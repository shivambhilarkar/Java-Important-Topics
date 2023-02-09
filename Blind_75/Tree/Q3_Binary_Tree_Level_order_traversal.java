package Blind_75.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Q3_Binary_Tree_Level_order_traversal {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {

        private List<List<Integer>> getLevelOrder(TreeNode root) {
            if (root == null) return new ArrayList<>();

            List<List<Integer>> result = new ArrayList<>();
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int queueSize = queue.size();
                List<Integer> level = new ArrayList<>();
                for (int i = 0; i < queueSize; i++) {
                    TreeNode curr = queue.poll();

                    level.add(curr.val);

                    if (curr.left != null) queue.add(curr.left);
                    if (curr.right != null) queue.add(curr.right);
                }
                result.add(level);
            }
            return result;
        }

        public List<List<Integer>> levelOrder(TreeNode root) {
            return getLevelOrder(root);
        }
    }

}
