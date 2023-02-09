package Blind_75.Tree;

import java.util.ArrayList;
import java.util.List;

public class Q4_Validate_Binary_Search_Tree {

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
         * Space Complexity ->
         * Time Complexity ->
         */
        private boolean validBST(TreeNode root) {
            if (root == null) return false;

            List<Integer> result = new ArrayList<>();
            postorderDFS(root, result);

            if (result.size() <= 1) return true;

            for (int i = 1; i < result.size(); i++) {
                if (result.get(i - 1) >= result.get(i)) {
                    return false;
                }
            }
            return true;
        }

        private void postorderDFS(TreeNode root, List<Integer> lst) {
            if (root == null) return;
            postorderDFS(root.left, lst);
            lst.add(root.val);
            postorderDFS(root.right, lst);
        }


        public boolean isValidBST(TreeNode root) {
            return validBST(root);
        }
    }
}
