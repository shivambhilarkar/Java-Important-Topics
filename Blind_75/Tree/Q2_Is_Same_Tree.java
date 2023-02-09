package Blind_75.Tree;

public class Q2_Is_Same_Tree {

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
        private boolean isTreeSame(TreeNode p, TreeNode q) {
            if (p == null && q == null) return true;
            if (p == null || q == null) return false;

            if (p.val != q.val) return false;

            boolean leftSubTree = isTreeSame(p.left, q.left);
            boolean rightSubTree = isTreeSame(p.right, q.right);
            return leftSubTree && rightSubTree;
        }

        public boolean isSameTree(TreeNode p, TreeNode q) {
            return isTreeSame(p, q);
        }
    }

}
