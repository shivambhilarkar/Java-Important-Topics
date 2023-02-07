package Blind_75.LinkedList;

import java.util.PriorityQueue;

public class Q3_Merge_k_sorted_lists {


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

        private ListNode getMergeList(ListNode[] lists) {
            if (lists == null) return null;

            //Min PriorityQueue
            PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> {
                return a.val - b.val;
            });
            for (ListNode head : lists) {
                if (head != null) {
                    queue.add(head);
                }
            }

            ListNode head = new ListNode();
            ListNode temp = head;
            while (!queue.isEmpty()) {
                ListNode curr = queue.poll();
                temp.next = curr;
                temp = temp.next;
                if (curr.next != null) {
                    queue.add(curr.next);
                }
            }
            return head.next;
        }

        public ListNode mergeKLists(ListNode[] lists) {
            return getMergeList(lists);
        }
    }

}
