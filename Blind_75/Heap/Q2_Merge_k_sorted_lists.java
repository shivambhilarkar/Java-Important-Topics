package Blind_75.Heap;

import java.util.PriorityQueue;

public class Q2_Merge_k_sorted_lists {

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
        private ListNode getMergedList(ListNode[] list) {
            if (list == null) return null;

            PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> {
                return a.val - b.val;
            });
            for (ListNode head : list) {
                if (head != null) queue.add(head);
            }

            ListNode dummyHead = new ListNode();
            ListNode temp = dummyHead;
            while (!queue.isEmpty()) {
                ListNode curr = queue.poll();
                temp.next = curr;
                temp = temp.next;
                if (curr.next != null) {
                    queue.add(curr.next);
                }
            }
            return dummyHead.next;
        }

        public ListNode mergeKLists(ListNode[] lists) {
            return getMergedList(lists);
        }
    }
}
