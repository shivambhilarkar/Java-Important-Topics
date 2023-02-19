package Blind_75.LinkedList;

public class Q5_Remove_nth_node_from_end {

    //      Definition for singly-linked list.
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
         * Space Complexity -> o(1)
         * Time Complexity -> o(n)
         */
        private ListNode removeNthLast(ListNode head, int n) {
            if (head == null) return null;

            ListNode start = new ListNode(-1);
            ListNode fast = start;
            ListNode slow = start;
            start.next = head;

            while (n-- >= 0) {
                fast = fast.next;
            }
            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return start.next;
        }

        public ListNode removeNthFromEnd(ListNode head, int n) {
            return removeNthLast(head, n);
        }
    }
}
