package Blind_75.LinkedList;

public class Q6_Reorder_list {
    //Definition for singly-linked list.
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

        private void reorderedList(ListNode head) {
            if (head == null) return;

            // split the list in two parts
            ListNode start = new ListNode(-1);
            ListNode slow = start;
            ListNode fast = start;
            start.next = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }


            //reverse second part
            ListNode prev = null;
            ListNode curr = slow.next;
            while (curr != null) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            // merge two list
            ListNode first = head;
            ListNode second = prev;
            slow.next = null;

            while (first != null && second != null) {
                ListNode firstNext = first.next;
                first.next = second;
                ListNode secondNext = second.next;
                second.next = firstNext;

                first = firstNext;
                second = secondNext;
            }
        }


        public void reorderList(ListNode head) {
            reorderedList(head);
        }
    }
}
