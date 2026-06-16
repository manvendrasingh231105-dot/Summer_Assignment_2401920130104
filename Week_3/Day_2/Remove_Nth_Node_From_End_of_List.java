package Week_3.Day_2;

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int length = getLength(head);  
        int pos = length - n;
        if(pos == 0){
            return head.next;
        }

        ListNode curr = head;

        while(pos > 1){
            curr = curr.next;
            pos--;
        }
        curr.next = curr.next.next;

        return head;
    }

    public int getLength(ListNode head){
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        return len;
    }
}