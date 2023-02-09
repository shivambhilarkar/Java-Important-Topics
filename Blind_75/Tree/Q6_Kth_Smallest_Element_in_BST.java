package Blind_75.Tree;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Q6_Kth_Smallest_Element_in_BST {

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

        /**
         * Brute Force Solution
         * Space Complexity -> O(n) + O(n)
         * Time Complexity -> o(n) + n(log k)
         */
        private int getKthSmallest(TreeNode root, int k) {
            if (root == null) return 0;

            PriorityQueue<Integer> lst = new PriorityQueue<>();
            ArrayDeque<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int queueSize = queue.size();
                for (int i = 0; i < queueSize; i++) {
                    TreeNode curr = queue.poll();
                    lst.add(curr.val);

                    if (curr.left != null) queue.add(curr.left);
                    if (curr.right != null) queue.add(curr.right);
                }
            }
            while (k-- > 1 && !lst.isEmpty()) {
                lst.poll();
            }
            return lst.peek();
        }

        public int kthSmallest(TreeNode root, int k) {
            return getKthSmallest(root, k);
        }
    }
}
