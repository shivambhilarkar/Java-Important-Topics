package Blind_75.LinkedList;

public class Q1_Reverse_Linked_List {


    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {

        /**
         * Optimal Approach
         * Time Complexity -> o(n)
         * Space Complexity -> o(1)
         */
        private ListNode getReverseList(ListNode head) {
            if (head == null) return null;

            ListNode currNode = head;
            ListNode prevNode = null;
            ListNode nextNode = null;

            while (currNode != null) {
                nextNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                currNode = nextNode;
            }
            return prevNode;
        }

        public ListNode reverseList(ListNode head) {
            return getReverseList(head);
        }
    }


}
