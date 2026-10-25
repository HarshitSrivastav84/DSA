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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = head;
        ListNode leftTemp = head;
        ListNode rightTemp = head;

        ListNode leftConnection = dummy;

        // ListNode leftConnection = head;
        
        ListNode rightConnection = null;

        ListNode prev = null;
        ListNode curr = null;
        ListNode next = null;

        int loopRun = right-left;

        if(left == right) return head;

        while(left > 1){
            if(left == 2){
                leftConnection = leftTemp;
            }
            leftTemp = leftTemp.next;
            left--;
        }
        prev = leftTemp;
        curr = leftTemp.next;
        while(right > 1){
            rightTemp = rightTemp.next;
            right--;
        }
        rightConnection = rightTemp.next;
        while(loopRun >= 1){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            loopRun--;
        }
        leftConnection.next.next = curr;
        // leftConnection.next.next = rightConnection;      // Also correct
        leftConnection.next = prev;

        // return head;

        return dummy.next;
    }
}