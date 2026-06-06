/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy1 = new ListNode(0);
        ListNode temp = dummy1;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null) {
            if(temp1.val <= temp2.val){
                dummy1.next = temp1;
                temp1 = temp1.next;
            }else{
                dummy1.next = temp2;
                temp2 = temp2.next;
            }
            dummy1 = dummy1.next;
        }

        if(temp1 == null){
            while(temp2 != null){
                dummy1.next = temp2;
                temp2 = temp2.next;
                dummy1 = dummy1.next;
            }
        }else{
            while(temp1 != null){
                dummy1.next = temp1;
                temp1 = temp1.next;
                dummy1 = dummy1.next;
            }
        }
        return temp.next;
    }
}