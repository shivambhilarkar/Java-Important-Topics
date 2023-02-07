package Blind_75.LinkedList;

public class Q2_Linked_list_cycle {


    //      Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {

        private boolean isHasCycle(ListNode head) {
            if (head == null) return false;

            ListNode fastPointer = head;
            ListNode slowPointer = head;
            while (fastPointer != null && fastPointer.next != null) {
                fastPointer = fastPointer.next.next;
                slowPointer = slowPointer.next;
                if (fastPointer == slowPointer) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasCycle(ListNode head) {
            return isHasCycle(head);
        }
    }


}
