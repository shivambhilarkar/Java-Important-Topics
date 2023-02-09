package Blind_75.Tree;

import java.util.ArrayDeque;

public class Q5_Maximum_Depth_of_binary_tree {

    // Definition for a binary tree node.
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
        public int getMaxDepthTree(TreeNode root) {
            if (root == null) return 0;

            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);

            int level = 0;
            while (!queue.isEmpty()) {
                int queueSize = queue.size();
                for (int i = 0; i < queueSize; i++) {
                    TreeNode curr = queue.poll();

                    if (curr.left != null) queue.add(curr.left);
                    if (curr.right != null) queue.add(curr.right);
                }
                level += 1;
            }
            return level;
        }

        public int maxDepth(TreeNode root) {
            return getMaxDepthTree(root);
        }
    }
}
