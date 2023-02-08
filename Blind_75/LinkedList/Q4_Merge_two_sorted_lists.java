package Blind_75.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4_Merge_two_sorted_lists {

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
         * Brute Force solution
         * Space Complexity -> o(n) + o(m)
         * TimeComplexity -> o(n) + o(n) + o(n log n); => o(n log n)
         */
        private ListNode getMergedList1(ListNode list1, ListNode list2) {

            List<Integer> list = new ArrayList<>();
            while (list1 != null) {
                list.add(list1.val);
                list1 = list1.next;
            }
            while (list2 != null) {
                list.add(list2.val);
                list2 = list2.next;
            }

            Collections.sort(list);

            ListNode head = new ListNode();
            ListNode temp = head;
            for (int i = 0; i < list.size(); i++) {
                temp.next = new ListNode(list.get(i));
                temp = temp.next;
            }

            return head.next;
        }


        private ListNode getMergedList(ListNode list1, ListNode list2) {
            if (list1 == list2) return null;
            if (list1 == null) return list2;
            if (list2 == null) return list1;


            ListNode l1pointer = list1;
            ListNode l2pointer = list2;

            while (l1pointer != null && l2pointer != null) {
                if (l1pointer.val <= l2pointer.val) {
                    ListNode nextPointer = l1pointer.next;
                    l1pointer.next = l2pointer;
                    l1pointer = nextPointer;
                } else {
                    ListNode nextPointer = l2pointer.next;
                    l2pointer.next = l1pointer;
                    l2pointer = nextPointer;
                }
            }


            return list1.val <= list2.val ? list1 : list2;

        }

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            return getMergedList1(list1, list2);
        }
    }
}
