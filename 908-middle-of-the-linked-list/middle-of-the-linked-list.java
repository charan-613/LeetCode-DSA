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
    public int ListLen(ListNode head) {
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode middleNode(ListNode head){
        int len = ListLen(head);
        int middle = len / 2;
        ListNode temp = head;
        int count = 0;
        while(count < middle){
            temp = temp.next;
            count++;
        }
        return temp;
    }
}